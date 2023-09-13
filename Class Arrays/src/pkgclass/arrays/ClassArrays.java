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
//Import here
import java.util.Scanner;
import java.util.*;
import java.util.Random;

public class ClassArrays {//BEGIN Class Definition
    //Instance data
    int ranNum;
    Random generator = new Random();
  
    public ClassArrays()
    {
    }// End constructor

    public void fillRandomArray(int[] intArray, int size)
    {
        for(int i = 0; i < size; i++)
        {
            ranNum = generator.nextInt(10) + 1;
            intArray[i] = ranNum;
        }//End for
    } //End fillRandomArray
    
    public void printIntegerArray(int[] intArray, int size)
    {
        //print a blank line
        System.out.println();
        for (int counter = 0; counter < size; counter++)
        {
            System.out.println("Element " +  (counter + 1) + " is " + (intArray [counter]));
        }//end for
        //print another blank line to make output pretty
        System.out.println();
    }//End printIntegerArray
    
    public void searchArray(int[] intArray, int size, int value)
    {
        int count = 0;
        for (int i = 0; i < size; i++) 
        {
            if (intArray[i] == value) 
            {
            count++;
            }//End if
        }//End for
        if (count == 0) 
        {
        System.out.println("Value not found in array.");
        }//End if
        else 
        {
        System.out.println("Value found " + count + " times in array.");
        }//End else
    }//End searchArray  
}//End class
