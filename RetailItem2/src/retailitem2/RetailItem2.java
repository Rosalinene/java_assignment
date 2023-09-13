/**
 * Progam name: phamRetailItem
 * Author: Huong Pham
 * Date: 9/25/2022
 * Course: CSC 111 - 307 Fund of computing I
 * Program Description:
 * In this assignment you will create a class called RetailItem that will hold the
information about a specific item. It will keep track of how many of that specific
item are in your inventory along with a short description of the item and the cost
of the item. This class can be used in a bigger program to keep track of inventory
and for placing orders.
Retail Item Class Requirements
• Instance data member for the description
• Instance data member for the quantity of the item in the inventory
• Instance data member for the price of the item
• Mutator methods
• Accessor methos
Main class requirements
• Creates 3 instance of the Retail Item class
• Populates each instance of RetailItem with the correct data as shown in the
table below
• Displays the data in the 3 Retail classes in a table format as shown below.
The lines are there to only give you a better idea of how to format the
output. Do not attempt to display the lines. 
 */

//1. Only in the external classes
//2. No constructor in Driver (class with main method)
//3. Must have same name as class they reside in
//4. No datatype. NO VOID
//5. Optional, if u dont need one => Java creates an emty one by default
//6. Input only. Use it for intializing data
package retailitem2;
// Import packages
import java.util.ArrayList;

public class RetailItem2 {
    private String description;
    private int unitsOnHand;
    private double price;
    
    // Constructor
    RetailItem2(String description, int unitsOnhand, double price) {
        this.description = description;
        this.unitsOnHand = unitsOnhand;
        this.price = price;
    }
    
    //getter and setter for description
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return this.description;
    }
    //getter and setter for units on hand
    public void setUnitsOnHand(int unitsOnHand) {
        this.unitsOnHand = unitsOnHand;
    }
    public int getUnitsOnHand() {
        return this.unitsOnHand;
    }
    //getter and setter for price
    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return this.price;
    }
    
    // Customize table
    public static void display(ArrayList<RetailItem2> input) {
        System.out.format("Description%38sUnits on Hand%8sPrice\n", "", "");
        for (int i = 0; i < input.size(); ++i) {
            System.out.format("Item #%d", i+1);
            System.out.format("%32s\t", input.get(i).getDescription());
            System.out.format("%10d\t\t", input.get(i).getUnitsOnHand());
            System.out.format("%.2f\n", input.get(i).getPrice());
        }
    }
    
    public static void main(String[] args) {
        // Create new objects
        RetailItem2 item1 = new RetailItem2("Hammer",12,25.99);
        RetailItem2 item2 = new RetailItem2("Circular Saw",40,89.99);
        RetailItem2 item3 = new RetailItem2("Drill",25,75.99);
        
        // Add values 
        ArrayList<RetailItem2> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
        items.add(item3);
        
        // Display table
        display(items);
    }
    
}
