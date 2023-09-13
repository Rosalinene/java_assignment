/**
 * @author Huong Pham
 * Date 9/20/2022
 * Fund of Computing I
 * Assignment 1: Restaurant bill
 **/
package restaurantbillassignment2;
// import packages
import java.util.Scanner;
import java.text.NumberFormat;

public class RestaurantBillAssignment2 {
    
    public static void main(String[] args) {
        // Tax rate fixed at 7.5%
        final double TAX_RATE = 0.075;
        // Tip rate fiexed at 18%
        final double TIP_RATE = 0.18;
        
        double bill, taxes, tip, total;
        
        // Calling constructor
        NumberFormat fmt1= NumberFormat.getCurrencyInstance();
        NumberFormat fmt2= NumberFormat.getPercentInstance();
        
        
        //Print out rates of tip and tax
        fmt2.setMinimumFractionDigits(1);
        System.out.println("Tax rate fixed at " + fmt2.format(TAX_RATE));
        fmt2.setMinimumFractionDigits(0);
        System.out.println("Tip rate fixed at " + fmt2.format(TIP_RATE));
        
        // Prompt user and get input from the user
        System.out.println("Type in your bill:");
        Scanner input = new Scanner(System.in);
        bill = input.nextDouble();
        
        // Caculate the amount of tax
        taxes = bill * TAX_RATE;
        // Caculate the amount of tip
        tip = bill * TIP_RATE;
        // Caculate the total bill
        total = bill + taxes + tip;
        
        // Display the amount of the bill
        System.out.println("The amount of the bill: " + fmt1.format(bill));
        // Display the amount of the tax
        System.out.println("The amount of the tax: " + fmt1.format(taxes));
        // Display the amount of the tip
        System.out.println("The amount of the tip: " + fmt1.format(tip));
        // Display the total of the bill
        System.out.println("The total of the bill: " + fmt1.format(total));
        
        System.out.println("Thank you!");
        // End.
    
    }
    
}
