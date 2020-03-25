/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;

/**
 *
 * @author Filippo
 */
import java.util.Scanner;

public class Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        /*This program will calculate the area of a circle, based on the radius
        that the user inputs. If the radius inputed is a negative integer or 
        equals to 0, the program will not compute and display a message warning
        the user of the mistake.
        */
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Input the radius of the circle");
        double radius = input.nextDouble();
        
        double area = (radius*radius) * Math.PI; 
         
        if (radius == 0) {
            System.out.println("The radius you have entered is 0, "
                               + "area cannot be calculated!");
        }
        else if (radius < 0) {
            System.out.println("The radius you have entered is a negative, "
                               + "area cannot be calculated!");
        }
        else if (radius > 0) {
            System.out.println("The area of the circle is " 
                               + Math.round(area) + " centimeters squared."); 
        }
        
    }
}    
