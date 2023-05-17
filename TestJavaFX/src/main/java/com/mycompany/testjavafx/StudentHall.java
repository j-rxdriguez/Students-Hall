package com.mycompany.testjavafx;


import java.util.ArrayList;

/** Collection class to hold a list of students

 */

public class StudentHall  
{
    private ArrayList<Student> StudentResidents;
    public final int MAX;
    public String hallName;
        
    /** Constructor initialises the empty students list and sets the maximum list size 
     *  @param   maxIn The maximum number of students in the list
     */
    public StudentHall(String theHallName, int maxIn)
    {
        StudentResidents = new ArrayList<>();
        MAX = maxIn;
        hallName = theHallName;
    }
	
    /** Adds a new Student to the list
     *  @param  resident The student to add
     *  @return Returns true if the student was added successfully and false otherwise
     */
    
   
    public boolean addStudent(Student resident)
    {
        if(!isFull())
        {
            StudentResidents.add(resident);
            return true;
        }
        else
        {
            return false;
        }
    }
     
        


   /** Reports on whether or not the list is empty
     *  @return Returns true if the list is empty and false otherwise
     */
    public boolean isEmpty()
    {
        return StudentResidents.isEmpty();
    }
	
    /** Reports on whether or not the list is full
     *  @return Returns true if the list is full and false otherwise
     */	
    public boolean isFull()
    {
        return StudentResidents.size()== MAX;
    }
        
    /** Gets the total number of students 
     *  @return Returns the total number of students currently in the list 
     */
    public int getTotal()
    {       
        return StudentResidents.size();
    }
      
    
    public Student getStudent(int positionIn)
    {
        if (positionIn < 0 || positionIn >= getTotal()) // check for valid position
        {
            return null; // no object found at given position
        }
        else
        {
            // remove one from logical poition to get ArrayList position
            return StudentResidents.get(positionIn);
        }
    }
    
    
    public String displayStudents()
    {
      String output = "\n";  
      output += "Students in the " + hallName + ":\n";
      for (int counter = 0; counter < StudentResidents.size(); counter++) { 
          output += "Student ID: " + StudentResidents.get(counter).getId() + "\n";
          output += "Student Name: " + StudentResidents.get(counter).getName()+ "\t" + StudentResidents.get(counter).getSurname();
          output += "\nDate of Birth: " + StudentResidents.get(counter).getDob();
          output += "\nGender: " +StudentResidents.get(counter).getGender(); 	
          output += "\n\n";
      } 
        return output;
  
    }
}
