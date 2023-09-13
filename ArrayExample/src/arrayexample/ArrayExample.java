/**
 * Progam name: phamArrayExample
 * Author: Huong Pham
 * Date: 11/14/2022
 * Course: CSC 111 - 307 Fund of computing I
 * Program Description:
 *END phamArrayExample
 *********************************************************************/
//Pre-Processor Declaration Section
package arrayexample;
//Place all imports here
import java.util.Scanner;

public class ArrayExample {
    //Instance data
    private int colorNumber;

    public void setColorNumber(int colorNumber){
        this.colorNumber = colorNumber;
    } // End setColorNumber.
    public int getColorNumber(){
        return this.colorNumber;
    } // End getColorNumber.
    
    public void arrayExample(Scanner userInput){
        String[] colors = new String[10]; //Set size
        System.out.println("You can choose 10 colors max"); 
        System.out.println("How many colors do you want to choose?"); //Prompt user
        this.setColorNumber(userInput.nextInt());
        userInput.nextLine();
        
        //Write error statement
        if(this.getColorNumber() <= 10)
        {
            int i=0;
            while (i < this.getColorNumber()){
                System.out.println("Please enter a color");
                colors[i] = userInput.nextLine();
                i++;
            }//End while loop
        }//End if
        else {
            System.out.println("Invalid Input");
            return;
        }//End else
 
        for(int i = 0;i < this.getColorNumber();i++){
            System.out.println("You have "+ colors[i]);
        }//End for loop
    }//End arrayExample
}//End class ArrayExample
