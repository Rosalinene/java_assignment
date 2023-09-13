
package classarrays;
import java.util.Scanner;

public class ArrayExample {

    public static void main(String[] args) {
        String stringType;                             //identifies type of data User will enter
        int menuItem;                                  //menu option selected by User
        String garbage;                                //get rid of extra enter key in buffer
        ClassArrays stringArray = new ClassArrays();   //object with string array options
        ClassArrays intArray = new ClassArrays();   	//object with integer array options
        Scanner scan = new Scanner(System.in);         //scanner object

        do
        {
            //print menu
            System.out.println("1:  Fill String Array.");
            System.out.println("2:  Print String Array.");
            System.out.println("3:  Fill Integer Array.");
            System.out.println("4:  Print Integer Array.");
            System.out.println("5:  Sort Integer Array.");
            System.out.println("6:  Exit.");
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

            else if (menuItem == 5)
            {
                intArray.sortIntegerArray();
            }

            else
            {
              System.out.println("Goodbye!");
            }
        }while(menuItem < 6);
      //end prompt
    }//End main
}//End class
