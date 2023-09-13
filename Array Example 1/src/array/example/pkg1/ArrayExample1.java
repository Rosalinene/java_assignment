
package array.example.pkg1;
import java.util.Scanner;
import java.util.* ;
public class ArrayExample1 {

    public static void main(String[] args) {
        String stringType;
         ArrayExample1 stringArray = new ArrayExample1();
         Scanner scan = new Scanner(System.in);
         
         System.out.println("Please enter a type of string: "); 
         stringType = scan.nextLine(); 
         
         stringArray.fillStringArray(stringType);
         stringArray.printStringArray();
    }
    
}
