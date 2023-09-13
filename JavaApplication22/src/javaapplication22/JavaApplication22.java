
package javaapplication22;

import java.util.Scanner;
import java.util.*;

public class JavaApplication22 {
    //Instance data
    final int SIZE = 10;
    int index = 0;
    int howMany;
    float sum, avg;
    String stringItem;
    String[] stringArray = new String[SIZE];
    int[] intArray = new int[SIZE];
    float[] floatArray = new float[SIZE];
    Scanner scan = new Scanner(System.in);

    public JavaApplication22()
    {
    }//end constructor

    public void fillStringArray(String item)
    {
        index = 0;
        stringItem = item;
        //print a blank line
        System.out.println();
        System.out.print ("How many " + stringItem + " will you enter? ");
        howMany = scan.nextInt();
        //print another blank line to make output pretty
        System.out.println();

        if (howMany <= SIZE)
        {
           while (index < howMany)
           {
              System.out.print ("Please enter " +  stringItem + " " + (index + 1) + ": ");
              stringArray [index] = scan.next();
              index++;
           }//end while
         }//end if
         else
        {
           System.out.println("You cannot print more than 10 " + stringItem + ".");
        }//end else
        //print another blank line to make output pretty
        System.out.println();
    }//end fillStrngArray

    public void printStringArray()
    {           
        //print a blank line
        System.out.println();
        for (int counter = 0; counter < howMany; counter++)
        {
            System.out.println(stringItem + " " +  (counter + 1) + " is " + (stringArray [counter]));
        }//end for
        //print another blank line to make output pretty
        System.out.println();
    }//end printStringArray

    public void fillIntegerArray(String item)
    {
        index = 0;
        stringItem = item;
        System.out.print ("How many " + stringItem + " will you enter? ");
        howMany = scan.nextInt();
        //print a blank line to make output pretty
        System.out.println();
        if (howMany <= SIZE)
        {
           while (index < howMany)
           {
              System.out.print ("Please enter " +  stringItem + " " + (index + 1) + ": ");
              intArray[index] = scan.nextInt();
              index++;
           }//end while
         }//end if
         else
        {
           System.out.println("You cannot enter more than 10 " + stringItem + ".");
        }//end else
        //print another blank line to make output pretty
        System.out.println();
    }//end fillIntegerArray

    public void printIntegerArray()
    {           
        //print a blank line
        System.out.println();
        for (int counter = 0; counter < howMany; counter++)
        {
            System.out.println(stringItem + " " +  (counter + 1) + " is " + (intArray [counter]));
        }//end for
        //print another blank line to make output pretty
        System.out.println();
    }//end integerStringArray 

    public void fillFloatArray(String item)
    {
        index = 0;
        stringItem = item;
        System.out.print ("How many " + stringItem + " will you enter? ");
        howMany = scan.nextInt();
        //print a blank line to make output pretty
        System.out.println();
        if (howMany <= SIZE)
        {
           while (index < howMany)
           {
              System.out.print ("Please enter " +  stringItem + " " + (index + 1) + ": ");
              floatArray[index] = scan.nextFloat();
              index++;
           }//end while
         }//end if
         else
        {
           System.out.println("You cannot enter more than 10 " + stringItem + ".");
        }//end else
        //print another blank line to make output pretty
        System.out.println();
    }//end fillFloatArray
    
    public void printFloatArray()
    {           
        //print a blank line
        System.out.println();
        for (int counter = 0; counter < howMany; counter++)
        {
            System.out.println(stringItem + " " +  (counter + 1) + " is " + (floatArray [counter]));
        }//end for
        //print another blank line to make output pretty
        System.out.println();
    }//end integerStringArray 
        
    public void computeAverage()
    {
       for(index = 0; index< howMany; index++)
       {
           sum += floatArray[index];
         } 
         avg = sum/howMany;  
         sum = 0;
    }//End computeAverage

    public float getAverage()
    {
       return this.avg;
    }//End getAverage   
}
