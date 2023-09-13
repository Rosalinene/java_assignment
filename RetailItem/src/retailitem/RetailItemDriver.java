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
table below java
• Displays the data in the 3 Retail classes in a table format as shown below.
The lines are there to only give you a better idea of how to format the
output. Do not attempt to display the lines. 
 *END RetailItem
 *********************************************************************/

//Pre-Processor Declaration Section
package retailitem;

//Place all imports here
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class RetailItemDriver { //BEGIN Class Definition
    public static void main(String[] args) {    
        // Create new objects
        RetailItem item1 = new RetailItem("Hammer",12,25.99);
        RetailItem item2 = new RetailItem("Circular Saw",40,89.99);
        RetailItem item3 = new RetailItem("Drill",25,75.99);
         
        // Display table
        JFrame frame1 = new JFrame();
        String columns[]={"Description","","Units on hand", "Price"};
        String rows[][]={{"Item #1",item1.getDescription(),item1.getunitsOnHand()+"",item1.getPrice()+""},{"Item #2",item2.getDescription(),item2.getunitsOnHand()+"",item2.getPrice()+""},{"Item #3",item3.getDescription(),item3.getunitsOnHand()+"",item3.getPrice()+""}};
        
        // Customize the table here
        JTable jt = new JTable(rows,columns); 
        JScrollPane sp = new JScrollPane(jt);
        frame1.add(sp);
        frame1.setSize(300,400);
        frame1.setVisible(true);
    }
}//END MAIN METHOD
