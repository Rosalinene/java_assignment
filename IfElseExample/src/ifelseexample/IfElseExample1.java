package ifelseexample;
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

//Place all imports here

import java.util.Scanner;

public class IfElseExample1   //BEGIN Class Definition (must be same as file name)
{
   public IfElseExample1( )
   {
   }//end constructor
   
   public int isPositive(int number)
   {
      int value;
      if (number > 0)
      {
         value = 1;
      }//end if number > 0
      else if (number == 0)
      {
         value = 0;
      }// end else if number == 0
      else
      {
         value = -1;
      }//end else number < 0
      return value;
   }//end isPositive
   
   //method to determine voter eligibility
   public void eligible (int age)
   {
      int howManyYears;  //how many years till User can vote
      if (age < 18)
      {
         howManyYears = 18 - age;
         System.out.println("You will be ready to vote in " + howManyYears + " year(s).");
      }//end if age < 18
      else
      {
         System.out.println("You are ready to vote.");
      }//end else
   }//end eligible   
}//end class IfElseExample
    
