/**********************************************************************

 *Program Name:       Use your last name and Program#  Ex:  mcCarthyProg1

 *Author:             Insert your name here

 *Date:               Insert due date here

 *Course/Section:     CSC 111-001 (***put in your section number here)

 *Program Description: 

 *   Put a brief description of what the program does here

 *  

 *  

 *

 

//Pre-Processor Declaration Section
package studentinfo;
//Place all imports here

import java.util.*;
import java.util.Scanner;

public class StudentInfo   //BEGIN Class Definition (must be same as file name)
{

//Instance Data
private String name;
private String address;
private String ID;

public StudentInfo (String studentName, String studentAddress, String studentID)
{
   name = studentName;
   address = studentAddress;
   ID = studentID;
}//end StudentInfo constructor

public StudentInfo ()
{
}//end empty constructor

public void setName(String studentName)
{
   name = studentName;
}//end setName

public String getName()
{
   return name;
}

}//end class


/** 
 * 1. Only in the external classes
 * 2. NO CONSTRUCTOR IN DRIVER (class with main method)
 * 3. Must have the same name as class they reside in
 * 4. NO DATATYPE. NO VOID
 * 5. Optional If u dont need one => Java will creates an empty one by default
 * 6. INPUT ONLY. Use it for initializing data
 * 7. When creating a instance of class scanner ure creating an object
 * 8. Can have more than one constructor
 */