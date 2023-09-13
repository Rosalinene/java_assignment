
package array.example.pkg1;

import java.util.Scanner;
import java.util.* ;
public class ArrayDriver {

    final int SIZE = 10;
    int index = 0;
    int howMany;
    String stringItem;
    int[] intArray = new int[SIZE];
    String[] stringArray = new String[SIZE];
    Scanner scan = new Scanner(System.in);
        
    public ArrayDriver()
    {
    }//end constructor
    public void fillStringArray(String item)
    {
        stringItem = item;
        System.out.print ("How many " + stringItem + " will you enter? ");
        howMany = scan.nextInt();
        if (howMany <= SIZE)
        {
           while (index < howMany)
           {
              System.out.print ("Please enter " + stringItem + " " + (index + 1) + ": ");
              stringArray [index] = scan.next();
              index++;
           }//end while
         }//end if
         else
        {
           System.out.println("You cannot print more than 10 colors.");
        }//end else
    }//end fillStrngArray

    public void printStringArray()
    {           
        for (int counter = 0; counter < howMany; counter++)
        {
            System.out.println(stringItem + " " + (counter + 1) + " is " + (stringArray [counter]));
        }//end for
    }//end printStringArray
    
    public void fillStringArray2(String item)
    {
        stringItem = item;
        System.out.print ("How many " + stringItem + " will you enter? ");
        howMany = scan.nextInt();
        if (howMany <= SIZE)
        {
           while (index < howMany)
           {
              System.out.print ("Please enter " + stringItem + " " + (index + 1) + ": ");
              intArray [index] = scan.nextInt();
              index++;
           }//end while
         }//end if
         else
        {
           System.out.println("You cannot print more than 10 colors.");
        }//end else
    }//end fillStrngArray
    public void printStringArray2()
    {           
        for (int counter = 0; counter < howMany; counter++)
        {
            System.out.println(stringItem + " " + (counter + 1) + " is " + (intArray [counter]));
        }//end for
    }//end printStringArray

}
