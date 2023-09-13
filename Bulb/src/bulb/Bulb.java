/**
 * Progam name: phamBulbLights
 * Author: Huong Pham
 * Date: 11/14/2022
 * Course: CSC 111 - 307 Fund of computing I
 * Program Description:
 * You are going to develop a Java Class and a Driver that will test the methods within the Class.
 * Name the Java Class:  Bulb.  It will contain the behaviors of a light bulb.
 * Name the Driver Class:  Lights.  It will test the methods within the Bulb Class.
 * 1.  The Bulb Class will include a separate method to perform each of the following:
 * A Constructor.  The Constructor will initialize the light bulb to False to represent "off" when the Bulb Class is instantiated. 
 * A method to turn off the light bulb by setting the bulb to false.
 * A method to turn on the light bulb by setting the bulb to true.
 * A method that returns the current state of the light bulb (Will return a True or False). 
 * 2.  Create a Driver Class to test Class Bulb.  Include the following in the Driver Class:
 * Instantiate an instance of class Bulb within the Driver.  Name this object lightBulb.
 * Create a menu in the Driver that allows you to test each of the methods within the class Bulb.  Be sure to include each of the following selections in the menu:
 * 1.  Turn the light bulb on.
 * 2.  Turn the light bulb off.
 * 3.  Display the status of the light bulb.
 * 4.  Exit.
 * Make sure all methods in Class Bulb work by thoroughly testing with the Driver.  To test, run the program and use the menu in the Driver to perform the following tasks before submitting:
 * Display the status of lightBulb.  It should be OFF since your constructor initializes the state to false.
 * Turn the lightBulb on.
 * Display the status of lightBulb. 
 * Turn the lightBulb off.
 * Display the status of lightBulb.
 * Turn the lightBulb on again.
 * Display the status of the lightBulb.
 *END phamBulbLights
 *********************************************************************/
//Pre-Processor Declaration Section
package bulb;
// Import packages
import java.util.Scanner;

public class Bulb {//BEGIN Class Definition
    Bulb() 
    {
        this.status = false;
    }
    //Instance Data
    private boolean status;
    private String bulbStatus;
    private int stop,selection;
    
    public void menu (Scanner userInput)
    {
        // Print out the menu
        stop = 0;
        while(stop != 1)
        {
        System.out.println("[1]Turn on the bulb.");
        System.out.println("[2]Turn off the bulb.");
        System.out.println("[3]Display the status of the light bulb.");
        System.out.println("[4]Exit.");
        selection = userInput.nextInt();
                switch(selection){
                case 1:
                {
                    this.on();
                    break;
                }//End case1
                
                case 2:
                {
                    this.off();
                    break;
                } //End case2
                
                case 3:
                {
                    
                    if(this.status)
                    {
                       bulbStatus = "on";
                    } else
                    {
                        bulbStatus = "off";
                    }
                    System.out.println("Status of the light bulb:" + bulbStatus);
                    break;
                }//End case3
                case 4:
                {
                    System.out.println("Exit.");
                    stop = 1;
                    break;
                }//End case4
            }//End switch this.plan: Display userPlan
        }//End while loop
    }// End planMenu.

    public void on()
    {
        status = true;
    }//End on
    
    public void off() 
    {
        status = false;
    }//End off
    
    public boolean status()
    {
        return status;
    }//End status
}//End class bulb
