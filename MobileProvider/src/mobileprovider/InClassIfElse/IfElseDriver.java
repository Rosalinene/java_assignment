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

public class IfElseExample   //BEGIN Class Definition (must be same as file name)
{public static void main(String[] args) {

      Scanner userInput = new Scanner (System.in);
      IfEleseExample test1 = new IfElseExample();
      
      int number;
      int posNeg;  //Indicates the number nether positive or negative 
      
      System.out.println("Please enter an integer");
      number = scan.nextInt();
      posNeg = test1.isPositive(number);
      if (posNeg == 1)
      {
         System.out.println("The number" + number + " you entered a positive");
      }
      else if (posNeg == 0) 
      {
         System.out.println("The number" + number + " you entered is zero");
      }
      else 
      {
         System.out.println("The number" + number + " you entered a negative");
      }     
}