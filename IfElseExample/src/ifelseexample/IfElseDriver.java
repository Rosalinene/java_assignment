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
package ifelseexample;
//Place all imports here
import java.util.Scanner;

 public class IfElseDriver   //BEGIN Class Definition (must be same as file name)

{
       public static void main (String[] args)  //BEGIN Main Method
        {
          //Data Declaration Section

          //List all Class Objects here
          Scanner scan = new Scanner(System.in);
          IfElseDriver test1 = new IfElseDriver();

          //Local Constants
          //List all constants here

          //Local Variables
          //List all variables here
          int number;
          int posNeg;      //indicates whether number is positive or negative
          int voterAge;    //age of voter
          int menuOption =0;

          //Executable Statement Section
          //This is where the code goes
          //Do NOT declare any variables, constants, or Objects in this section.  NEVER!
          
          //Display menu
          while(menuOption <10)
          {// begin while loop  
            System.out.println("1. Positive? Negative? Zero?");
            System.out.println("2. Ready to Vote?");
            System.out.println("10.Exit");

            //Prompt User to enter option
            System.out.println("1. Please enter menu option: ");
            menuOption = scan.nextInt();

            //Which option?
            if (menuOption == 1)
            {
                  //Ask User to enter an integer
                  System.out.println("Please enter an integer");
                  number = scan.nextInt();
                  int posNeg = test1.isPositive(number);
                  if (posNeg == 1)
                  {
                    System.out.println("The number " + number + " you entered is positive.");
                  }//end if posNeg == 1
                  else if (posNeg == 0)
                  {
                    System.out.println("The number " + number + " you entered is zero.");
                  }// end else if posNeg = 0
                  else
                  {
                    System.out.println("The number " + number + " you entered is negative.");

                  }//end else posNeg == 0
            }//end menu option 1
            else if (menuOption == 2)
            {
                  //Determine voting rights
                  System.out.println("Please enter your age: ");
                  voterAge = scan.nextInt();
                  test1.IfElseExample1.eligible(voterAge);
            }//end else if option = 2
            else
            {
               System.out.println("You didn't enter a valid menu option");
            }//end else
          }//end while
      }//END main method

  }//END Driver Class