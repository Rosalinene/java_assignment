/**
 * @author Huong Pham
 * Date 9/25/2022
 * Fund of computing I
 * Assignment 2: Retail Item
 */
package retail.itiem;
// Import packages
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class RetailItiem {
    private String description;
    private int unitsOnhand;
    private double price;
    
    //getter and setter for description
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return this.description;
    }
    //getter and setter for units on hand
    public void setUnitsonhand(int unitsOnhand) {
        this.unitsOnhand = unitsOnhand;
    }
    public int getUnitsonhand() {
        return this.unitsOnhand;
    }
    //getter and setter for price
    public void setPrice(double price) {
        this.price = price;
        }
    public double getPrice() {
        return this.price;
    }
    // constructor
    RetailItiem(String description, int unitsOnhand, double price) {
        this.description = description;
        this.unitsOnhand = unitsOnhand;
        this.price = price;
    }
    
    public static void main(String[] args) {
       
        // create new objects
        RetailItiem item1 = new RetailItiem("Hammer",12,25.99);
        RetailItiem item2 = new RetailItiem("Circular Saw",40,89.99);
        RetailItiem item3 = new RetailItiem("Drill",25,75.99);
        
        JFrame frame1 = new JFrame();
        item1.toString();
        String columns[]={"Description","","Units on hand", "Price"};
        String rows[][]={{"Item #1",item1.getDescription(),item1.getUnitsonhand()+"",item1.getPrice()+""},{"Item #2",item2.getDescription(),item2.getUnitsonhand()+"",item2.getPrice()+""},{"Item #3",item3.getDescription(),item3.getUnitsonhand()+"",item3.getPrice()+""}};
        
        
        JTable jt = new JTable(rows,columns); 
        jt.setBounds(30,40,200,300);
        
        JScrollPane sp = new JScrollPane(jt);
        frame1.add(sp);
        frame1.setSize(300,400);
        frame1.setVisible(true); 
    }
    
}

