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
 * Requirements Mobile Service Provider Class
 * Store the plan the customer has.
 * Store the number of minutes used by the customer.
 * Store the price for each plan and the number of minutes for each plan.
 * Provide the correct Set methods (mutators).
 * Provide the correct Get methods (accessors).
 * Provide an internal only method to determine if an upgrade should be suggested.
 * Provide a method to display the upgrade if it’s determined one of the other plans is better.
 * Provide a method to determine the amount of the bill.
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
//Place all imports here
import java.util.Scanner;

public class MobileServiceProvider { //BEGIN Class Definition
    MobileServiceProvider() {
        this.setPointAB();
        this.setPointAC();
        this.setPointBC();
    }

    //Instance Data
    private double bill;
    private int plan, minutesUsed;
    private final double COST_A = 39.99;
    private final double COST_B = 59.99;
    private final double COST_C = 69.99;
    private final int MINUTES_A = 450;
    private final int MINUTES_B = 900;
    private final double OVER_A = 0.45;
    private final double OVER_B = 0.40;
    private double balance_point_AB;
    private double balance_point_AC;
    private double balance_point_BC;
    
    public int getPlan(){
        return this.plan;
    } // End getPlan.
    public void setPlan(int plan){
        this.plan = plan;
    } // End setPlan.
    public int getMinutes(){
        return this.minutesUsed;
    }// End getMinutes.
    public void setMinutes(int minutes){
        this.minutesUsed = minutes; 
    } // End setMinutes.
    public double getBill(){
        return this.bill;
    } // End getBill.
    public final void setPointAB(){
        this.balance_point_AB = (COST_B - COST_A) / OVER_A + MINUTES_A;
    }// End setPointAB.
    public double getPointAB(){
        return this.balance_point_AB;
    }// End getPointAB.
    public final void setPointAC(){
        this.balance_point_AC = (COST_C - COST_A) / OVER_A + MINUTES_A;
    }// End setPointAC.
    public double getPointAC(){
        return this.balance_point_AC;
    }// End getPointAC.
    public final void setPointBC(){
        this.balance_point_BC = (COST_C - COST_B) / OVER_B + MINUTES_B;
    }// End setPointBC.
    public double getPointBC(){
        return this.balance_point_BC;
    }// End getPointBC.
    
    public void planMenu (Scanner userInput)
    {
        // Print out the menuPlan
        System.out.println("[1] Package A: $39.99 per month for 450 minutes, each extra minute $0.45 per minute.");
        System.out.println("[2] Package B: $59.99 per month for 900 minutes, each extra minute $0.40 per minute.");
        System.out.println("[3] Package C: $69.99 per month for unlimited minutes.");
        System.out.println("Please choose your mobile plan: "); //Prompt userPlan
        this.setPlan(userInput.nextInt());
    }// End planMenu.
       
    public void getUserMinutes(Scanner userInput)
    {
        // Prompt userMinutes
        System.out.println("Please enter the number of minutes used: ");
        this.setMinutes(userInput.nextInt());
        this.calculateBill();
    }// End getUserMinutes
    
    public void calculateBill() {
        switch(plan) {
            case 1:
            {
                if (this.minutesUsed <= MINUTES_A)
                {
                    this.bill = this.COST_A;
                    return;
                } //End if case1: userMinutes <=450; bill = $39.99 without extra charge                                            
                    this.bill = (this.minutesUsed - this.MINUTES_A)* this.OVER_A + this.COST_A;
                    return;    
            } //End case1: userMinutes =>450; bill = $39.99 with extra charge OVER_A = $0.45
				
            case 2:
            {
                if (this.minutesUsed <= this.MINUTES_B)
                {
                    this.bill = this.COST_B;
                    return;
                }//End if case2: userMinutes <=900; bill = $59.99 without extra charge
                    this.bill = (this.minutesUsed - this.MINUTES_B)* this.OVER_B + this.COST_B;
                    return;
            } //End case2: userMinutes =>900; bill = $59.99 with extra charge OVER_B = $0.40
            
            case 3: 
            {
                this.bill = this.COST_C;
                return;
            } //End case3: userMinutes = unlimited without extra charge
				
            default:
            {
                System.out.println(this.plan);
                System.out.println("\nInvalid input!");   
            } //End default
        }//End switch: calculateBill of userInput     
    }//End calculateBill
    
    public void displayBill()
    {	
        if (this.bill != 0){
            switch(this.plan){
                case 1:
                {
                    System.out.println("Your plan is A");
                    break;
                }//End case1: Display if userPlan = A
                
                case 2:
                {
                    System.out.println("Your plan is B");
                    break;
                } //End case2: Display if userPlan = B
                
                case 3:
                {
                    System.out.println("Your plan is C");
                    break;
                }//End case3: Display if userPlan = C
            }//End switch this.plan: Display userPlan
            System.out.println("You have used the service for " + this.minutesUsed + " minutes!"); // Print minutesUsed
            System.out.println("Your monthly bill is $" + this.bill); //Print userbill
        }//End if this.bill if bill !=0
        else
            System.out.println("\n"); //End else displayBill
    }//End displayBill
    
    public void suggestPlan()
    {
        switch(plan) {
            case 1: 
            {
                if (this.minutesUsed >= this.balance_point_AC) {
                    System.out.println("You would save more money switching to plan C!");
                }//End if case1: minutesUsed >= balance point BC then display suggestion
                else if (this.minutesUsed >= this.balance_point_AB) {
                    System.out.println("You would save more money switching to plan B!");
                }//End else if case1: : minutesUsed >= balance point AB then display suggestion
                else {
                    System.out.println("You are on the right plan for you!");
                }//End else case1: keep the plan
                break;
            }//End case1:suggest case for plan A
            
            case 2:
            {
                if (this.minutesUsed >= this.balance_point_BC) {
                    System.out.println("You would save more money switching to plan C!");
                }//End if case2: minutesUsed >= balance point BC then display suggestion
                else {
                    System.out.println("You are on the right plan for you!");
                }//End else case2: keep the plan
                break;
            } //End case2:suggest case for plan B  
            default:
                {
                }
        }//End switch plan
    }//End suggestPlan
}//End class MobileServiceProvider
