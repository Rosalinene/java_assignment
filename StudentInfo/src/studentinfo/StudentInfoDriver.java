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

 *Initial Algorithm:

 *  Place the Initial Algorithm here

 *

 *
 *

 *Refined Algorithm:

 *BEGIN Prog1

 *   Place the Refined Algorithm here

 *  

 *  

 *  

 *END Prog1

 *********************************************************************/

//Pre-Processor Declaration Section
package studentinfo;

//Place all imports here
import java.util.Scanner;

public class StudentInfoDriver  //BEGIN Class Definition (must be same as file name)

{
        public static void main (String[] args)  //BEGIN Main Method

        {

          //Data Declaration Section

          //List all Class Objects here

            Scanner scan = new Scanner(System.in);
          // create object
          StudentInfo studentData1 = new StudentInfo();
          StudentInfo studentData2 = new StudentInfo("Huong dangiu","123 Liverpool","12345");
          StudentInfo studentData3 = new StudentInfo("Rosaline","1217 Tulip","23456"); 

          //Local Constants
          //List all constants here

          //Local Variables
          //List all variables here
          String nameStudent;
          String addressStudent;
          String idStudent;
          
          System.out.println("Please enter the student name");
          nameStudent = scan.nextLine();
          System.out.println("Please enter the student address");
          addressStudent = scan.nextLine();
          System.out.println("Please enter the student ID");
          idStudent = scan.nextLine();
          
          studentData1.setName(nameStudent);
          
          nameStudent = studentData2.getName();
          System.out.println("Student 2 name:"+nameStudent);
          
          nameStudent = studentData1.getName();
          System.out.println("Student 1 name:"+nameStudent);
          
          nameStudent = studentData3.getName();
          System.out.println("Student 3 name:"+nameStudent);
         

          //Executable Statement Section
          //This is where the code goes
          //Do NOT declare any variables, constants, or Objects in this section.  NEVER!

          

 

      }//END main method

 

  }//END mcCarthyProg1 Class