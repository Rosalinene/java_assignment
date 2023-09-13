/**
 * Progam name: phamMobileProvider
 * Author: Huong Pham
 * Date: 10/24/2022
 * Course: CSC 111 - 307 Fund of computing I
 * Program Description:
 * In this assignment you will be creating a class that maintains data for a mobile phone service.
 * The phone service has the following package options:
 * Package A: $39.99 per month for 450 minutes, each extra minute $0.45 per minute.
 * Package B: $59.99 per month for 900 minutes, each extra minute $0.40 per minute.
 * Package C: $69.99 per month for unlimited minutes.
 * Internally the program will keep track of the cost of each package, which package the customer currently has and the number of minutes used.
 * It will then use that information to calculate the bill for that month.
 * It will also need to determine if the customer would save money by changing plans. This will be based on the current plan and the number of minutes used by the customer.
 * If customer is on plan A then the program will need to determine if it’s better for the customer to move to plan B or C.
 * If the customer is on plan B then the program needs to determine if the customer should move to plan C.
 * It does not change the plan for the customer, just tells them they might be better off with an upgrade.
 * 
 * 
 * Requirements Mobile Service Provider Class
 * Store the plan the customer has.
 * Store the number of minutes used by the customer.
 * Store the price for each plan and the number of minutes for each plan.
 * Provide the correct Set methods (mutators).
 * Provide the correct Get methods (accessors).
 * Provide an internal only method to determine if an upgrade should be suggested.
 * Provide a method to display the upgrade if it’s determined one of the other plans is better.
 * Provide a method to determine the amount of the bill.
 * 
 * 
 * Requirements Main Driver Class
 * Creates 2 instances of the above class (two different customers).  Do not initialize the objects with any data.
 * Display a menu with package options.
 * Prompt the user to select a package.
 * Prompt the user for the number of minutes used.
 * Provide the information inputted by the user to the instance of the above class.
 * Repeat the last 3 steps for the second customer.
 * Display the customer bill information. 
 *END phamMobileProvider
 *********************************************************************/
//Pre-Processor Declaration Section

package mobileserviceprovider;
// Import packages
import java.util.Scanner;

public class MainDriver { //BEGIN Class Definition
    
    public static void main(String[] args) {
        //List all Class Objects here
        Scanner userInput = new Scanner (System.in);
        MobileServiceProvider prov1 = new MobileServiceProvider();
        MobileServiceProvider prov2 = new MobileServiceProvider();
        
        prov1.planMenu(userInput);        //Display planMenu and prompt user1Plan
        prov1.getUserMinutes(userInput);  //Prompt user1MinutesUsed
        prov1.displayBill();              //Display bill1 
        prov1.suggestPlan() ;             //Display suggestion     
                
        prov2.planMenu(userInput);        //Display planMenu and prompt user2Plan
        prov2.getUserMinutes(userInput);  //Prompt user2MinutesUsed
        prov2.displayBill();              //Display bill1
        prov2.suggestPlan();              //Display suggestion
    }
}
