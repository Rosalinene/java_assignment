/**
 * @author Huong Pham
 * Date 9/20/2022
 * Fund of Computing I
 * Assignment 1: Restaurant bill
 **/
package restaurantbillassignment;
// Import packages
import java.util.Scanner;
import java.text.NumberFormat;

public class Restaurantbillassignment {
    // Tax rate fixed at 7.5%
    public static final double TAX_RATE = 0.075;
    // Tip rate fixed at 18%
    public static final double TIP_RATE = 0.18;
    
    private double bill, tax, tip, total;
    
    // set and get for bill
    public void setBill(double bill) {
        this.bill = bill;
    }
    public double getBill() {
        return this.bill;
    }
    // set and get for tax
    public void setTax() {
        this.tax = bill * TAX_RATE;
    }
    public double getTax() { 
        return this.tax; 
    }
    // set and get for tip
    public void setTip() {
        this.tip = bill * TIP_RATE;
    }
    public double getTip() {
        return this.tip;
    }
    // set and get for total
    public void setTotal() {
        this.total = this.bill + this.tax + this.tip;
    }
    public double getTotal(){
        return this.total;
    }
    
    public static void main(String[] args){
        // Calling constructor
        NumberFormat fmt1 = NumberFormat.getCurrencyInstance();
        NumberFormat fmt2 = NumberFormat.getPercentInstance();
        
        //Create a new object
        Restaurantbillassignment assignmentObject = new Restaurantbillassignment();
        
        // Print out rates of tip and tax
        fmt2.setMinimumFractionDigits(1);
        System.out.println("Tax rate fixed at " + fmt2.format(Restaurantbillassignment.TAX_RATE));
        fmt2.setMinimumFractionDigits(0);
        System.out.println("Tip rate fixed at " + fmt2.format(Restaurantbillassignment.TIP_RATE));
        
        // Prompt user and get input from the user
        System.out.println("Type in your bill:");
        Scanner input = new Scanner(System.in);
        double billInput = input.nextDouble();
        
        assignmentObject.setBill(billInput);
        
        // Caculate the amount of tax
        assignmentObject.setTax();
        // Caculate the amount of tip 
        assignmentObject.setTip();
        // Caculate the total 
        assignmentObject.setTotal();
        
        // Display the amount of the bill
        System.out.println("The amount of the bill: " + fmt1.format(assignmentObject.getBill()));
        // Display the amount of tax
        System.out.println("The amount of tax: " + fmt1.format(assignmentObject.getTax()));
        // Display the amount of tip
        System.out.println("The amount of tip: " + fmt1.format(assignmentObject.getTip()));
        // Display the total of the bill
        System.out.println("The total of the bill:" + fmt1.format(assignmentObject.getTotal()));
        
        System.out.println("Thank you!");
        //End
    }
    
}
// Hang so (constant) (final double) luon viet hoa tat ca cac chu viet hoa
// 