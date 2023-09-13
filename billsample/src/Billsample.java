//Prologue Section

/**********************************************************************

 *Program Name:       nguyenRestaurantBill

 *Author:             Viet Anh nguyen

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
import java.text.NumberFormat;

public class Billsample   //BEGIN NewClass
{
    public static void main (String[] args)  //BEGIN Main Method
    {
          //Data Declaration Section

          //List all Class Objects here
          Scanner scan = new Scanner(System.in);

          //Local Constants

          //List all constants here 

          //Local Variables

          //List all variables here
          double subTotal;          //Cost of the dinner
          double grandTotal;        // Total cost includes sales tax and tip
          double totalTax;          // Taxes on the dinner
          double totalTip;          // Tip for the dinner
          
          //Executable Statement Section

          //This is where the code goes

          //Do NOT declare any variables, constants, or Objects in this section.  NEVER!
          
          //Prompt User for the cost of the dinner
          System.out.print("Please enter the cost of the meal: ");
          subTotal = scan.nextDouble();
          
          //Get the sales tax of the dinner
          totalTax = salesTax(subTotal);
          
          //Get the tip amount of the dinner
          totalTip = computeTip(subTotal);
          
          // compute the grand total
          grandTotal = subTotal + totalTax + totalTip;
          
          //call
          
          //Display the ocse of the dinner + sales tax
          System.out.println("The sales tax is: " + totalTax);
          
          System.out.println("The tip amount is: " + totalTip);
          
          System.out.println("The total cost of the dinner is: " + grandTotal);
         
    
    }//END main method
    
    public static double salesTax(double itemCost)
    //methods to compute sales tax
    {
        //data declaration section
        final double TAX_RATE = 0.075; //tax rate
        double tax;                    //total tax
        
        //body of code
        tax = itemCost * TAX_RATE;
        return tax;
    }//end salesTax
    
    public static double computeTip(double itemCost)
    {
        //data declaration section
        final double TIP = 0.18; //tip rate
        double tipAmount;        //tip amount
        
        //body of code
        //compute the tip
        tipAmount = itemCost * TIP;
        return tipAmount;
    }//end computeTip
    
    public static void printBill(double printSubTotal, double printTotalTax1, double printTotalTip, double printItemCost1)
    {
        System.out.println("The subtotal of the dinner is: " + printItemCost1);
        System.out.println("The sales tax is: " + printTotalTax1);
        System.out.println("The tip amount is: " + printTotalTip);
        System.out.println("The total cost of the dinner is: " + printSubTotal);
        
        
        
        
    }
// chi dat data types trong header
 }//END NewClass