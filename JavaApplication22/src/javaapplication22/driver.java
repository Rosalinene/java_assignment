
package javaapplication22;

import java.util.Scanner;

public class driver {

    public static void main(String[] args) {
        String stringType = null;                             //identifies type of data User will enter
        String grade = "Grade";
         int menuItem;                                  //menu option selected by User
         String garbage;                                //get rid of extra enter key in buffer
         JavaApplication22 stringArray = new JavaApplication22();   //object with string array options
         JavaApplication22 intArray = new JavaApplication22();   	//object with integer array options
         JavaApplication22 grades = new JavaApplication22();
         Scanner scan = new Scanner(System.in);         //scanner object

         do
         {
               //print menu
               System.out.println("1:  Fill String Array.");
               System.out.println("2:  Print String Array.");
               System.out.println("3:  Fill Integer Array.");
               System.out.println("4:  Print Integer Array.");
               System.out.println("5:  Exit.");
               //print a blank line
               System.out.println();

               //prompt for menu choice
               System.out.println("Please enter menu option: ");
               menuItem = scan.nextInt();
               garbage = scan.nextLine();  //get rid of enter key in buffer

               //print another blank line so things look pretty
               System.out.println();

               //now process menu selection
               if (menuItem == 1)
               {
                  //fill string array
                  System.out.println("Please enter the type of string:  ");
                  stringType = scan.nextLine();
                  stringArray.fillStringArray(stringType);
               }//end if
               else if (menuItem == 2)
               {
                  //print out string array
                  stringArray.printStringArray();
               }
               else if (menuItem == 3)
               {
                  //fill integer array
                  System.out.println("Please enter the type of integer:  ");
                  stringType = scan.nextLine();
                  intArray.fillIntegerArray(stringType);
               }
               else if (menuItem == 4)
               {
                 //print out integer array
                 intArray.printIntegerArray();
               }
               else
               {
                 System.out.println("Goodbye!");
               }
         }while(menuItem < 5); //end prompt
         
         do
         {
            //print menu
            System.out.println("1:  Fill the grades.");
            System.out.println("2:  Print out the grades.");
            System.out.println("3:  Compute the average of the grades.");
            System.out.println("4:  Print out the average of the grades.");
            System.out.println("5:  Exit.");
            //print a blank line
            System.out.println();

            //prompt for menu choice
            System.out.println("Please enter menu option: ");
            menuItem = scan.nextInt();
            garbage = scan.nextLine();  //get rid of enter key in buffer

            //print another blank line so things look pretty
            System.out.println();
            
            //now process menu selection
               if (menuItem == 1)
               {
                  //fill grades
                  // System.out.println("Please enter the grades:  ");
                  // 5stringType = scan.nextLine();
                  grades.fillFloatArray(grade);
               }//end if
               else if (menuItem == 2)
               {
                  //print out string array
                  grades.printFloatArray();
               }//End else if
               else if (menuItem == 3)
               {
                  //Compute average
                  grades.computeAverage();
               }//End else if
               else if (menuItem == 4)
               {
                 //print out integer array
                 System.out.format("Your Average is: " + grades.getAverage());
               }//End else if
               else
               {
                 System.out.println("Do you want to run the program again?");
                 System.out.println("1: YES");
                 System.out.println("2: NO");
                 menuItem = scan.nextInt();
                 garbage = scan.nextLine();  //get rid of enter key in buffer
                 if (menuItem == 1)
                 {
              
                 }//end if
                 else
                 {
                  System.out.println("Goodbye!");
                  menuItem = 5;
                 } //End else
               }//End else
         }while(menuItem < 5); //end prompt
         //End while
    }
    
}
