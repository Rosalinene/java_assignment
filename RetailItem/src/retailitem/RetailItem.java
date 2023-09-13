/**
 * Progam name: phamRetailItem
 * Author: Huong Pham
 * Date: 10/17/2022
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
 *END RetailItem
 *********************************************************************/
//Pre-Processor Declaration Section
package retailitem;
// Import packages

public class RetailItem { //BEGIN Class Definition
    //Instance Data
    private String description;
    private int unitsOnHand;
    private double price;
    
    RetailItem(String description, int unitsOnHand, double price) {
        this.description = description;
        this.unitsOnHand = unitsOnHand;
        this.price = price;
    }//end RetailItem constructor
    
    public void setDescription(String description) {
        this.description = description;
    }//End setDescription
    public String getDescription() {
        return this.description;
    }//End getDescription
    
    public void setunitsOnHand(int unitsOnHand) {
        this.unitsOnHand = unitsOnHand;
    }//End setunitsOnHand
    public int getunitsOnHand() {
        return this.unitsOnHand;
    }//End getunitsOnHand
    
    public void setPrice(double price) {
        this.price = price;
        }//End setPrice
    public double getPrice() {
        return this.price;
    }//End getPrice
}//End class
