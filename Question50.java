/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question50;

/**
 *
 * @author Filippo
 */
import java.util.Scanner;

public class Question50 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*This program will prompt the user to input the current temperature 
        in Farenheit, it will then output a probable season that you're in right
        now. If the inputs are not valid inputs, the program will warn the 
        user of the mistake.
        */
        Scanner input = new Scanner (System.in);
        
        System.out.println("Enter the current temperature in Farenheit:");
        double farenheit = input.nextDouble();
        
        if (farenheit >= 90) {
            System.out.println("It is probably summer right now.");
        }
        if (farenheit >= 70 && farenheit < 90) {
            System.out.println("It is probably spring right now.");
        }
        if (farenheit >= 50 && farenheit <  70) {
            System.out.println("It is probably fall right now.");
        }
        if (farenheit < 50) {
            System.out.println("It is propably winter right now.");
        }
        if (farenheit > 110) {
            System.out.println("Temperature inputed is outside of the valid range.");
        }
        if (farenheit < -5) {
            System.out.println("The temperature inputed is outside of the valid range.");
        }
    }
    
}
