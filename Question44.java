/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question44;

/**
 *
 * @author Filippo
 */
import java.util.Scanner;

public class Question44 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        /*This program will calculate the area of two shapes, a square and a
        rectangle. If the two areas are equal, the program will display a message 
        saying the areas are indeed equal. If the areas are not equal then the 
        program will display that as well. 
        */
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("This program is going to calculate the area of a "
                + "square with a side of 0.666666667, and a rectangle with sides"
                + " 1/9 and 4. The two areas will then be compared to see if"
                + " they're equal");
        
        double area1 = 0.666666667 * 0.666666667;
        double area2 = 4 * 0.111111111111111 ;
        
        System.out.println("The area of the square is equal to " + area1 + 
                           " centimeters squared.");
        
        System.out.println("The area of the rectangle is equal to " + area2 +
                           " centimeters squared.");
        
        if (area1 == area2) {
            System.out.println("The shapes have equal areas.");
        }
        if (area1 != area2) {
            System.out.println("The areas of the two shapes are unequal.");
        }
    }
    
}
