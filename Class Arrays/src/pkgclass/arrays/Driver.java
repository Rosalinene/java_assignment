/**
 * Progam name: phamProgram6
 * Author: Huong Pham
 * Date: 12/05/2022
 * Course: CSC 111 - 307 Fund of computing I
 * Program Description:
 * Write a program that will do the following:

Create an external class and name it Class Arrays.  Include the following:

A method that will fill an array with random numbers.  Modify the method from the previous program assignment as follows:
Name the method "fillRandomArray." 
The parameter list will have two arguments:
an integer array named "intArray"
an integer containing the size of the array named "size."
generate "size" random integers with a range of 1 to 10 and place them into an array.   
Use the method that generates one random number from class.  YOU MUST USE THE Random Number METHOD FROM CLASS!!!
      2.  A method that will print out an integer Array.  Use the method from the previous program assignment.
      3.  A method that will seach through an integer array.  Use the following specifications:
      * The method datatype is void because no data will be returned.

It will have three parameters – the integer array, the number of items in the array, and the value it will be searching for in the array. 
It will search through the array and count how many times the value was found.
It will then either print out how many times the value was found or that the value was not found.
Create a Driver and include:

The following instance data:
A constant named SIZE and intialize it to 10.
An integer array of size 10 named "randomArray."
An integer to hold one random number named "searchValue."
A sentinel driven outer While Loop to repeat the task.
Ask the User if they wish to generate a new set of random numbers
Call the fillRandomArray method and send it "randomArray" and SIZE.
Call the print method and send it "randomArray" and SIZE.
Generate ONE random number by calling the random number method.
Assign the call to "searchValue."
Send the method a 1 and 10 as the range.
Call the search method and send it "randomArray", SIZE, and "searchValue."
NOTE: Other than the prompt to ask the user to generate a new set of numbers, there is no other input from the User in this program.
* END phamProgram6
 *********************************************************************/
package pkgclass.arrays;

import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {//BEGIN Class Definition
        //Instance data
        final int SIZE = 10;
        int[] randomArray = new int[SIZE];
        int searchValue = 5;
        ClassArrays intArray = new ClassArrays();
        
        boolean continueLoop = true;
        while (continueLoop) 
        {
            System.out.println("Generate set of random numbers? (y/n)");
            Scanner scanner = new Scanner(System.in);
            char input = scanner.next().charAt(0);
            
            if (input == 'n') 
            {
            System.out.println("Goodbye!");
            continueLoop = false;
            } //End if
            else
            {
            intArray.fillRandomArray(randomArray, SIZE);
            intArray.printIntegerArray(randomArray, SIZE);
            intArray.searchArray(randomArray, SIZE, searchValue);
            }//End else
        }//End while
    }//End main 
}//End class
