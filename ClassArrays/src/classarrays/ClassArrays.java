
package classarrays;

//Import here
import java.util.Scanner;
public class ClassArrays {

    //Instance data
    final int SIZE = 10;
    int index = 0;
    int howMany;
    String stringItem;
    String[] stringArray = new String[SIZE];
    int[] intArray = new int[SIZE];
    Scanner scan = new Scanner(System.in);

    public ClassArrays()
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
        
        public void sortIntegerArray()
        {
            int temp;
            for (int i = 0; i < (howMany - 1); i++)
            {
                for (int j = 1; j < howMany; j++)
                {
                    if (intArray[j] < intArray[j-1])
                    {
                        //swap
                        temp = intArray[j];
                        intArray[j] = intArray[j-1];
                        intArray[j-1] = temp;
                    }//End if
             }//End for
         }//End for
     }//end sortIntegerArray     
}//end clas ClassArays
