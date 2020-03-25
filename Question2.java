/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question2;

/**
 *
 * @author Filippo
 */
import java.util.Scanner;

public class Question2 {
    
    public static void main(String args[]) {
        
        /*This program will calculate the user's BMI with the formula 
        provided. It will calculate the BMI, by asking the user of their weight
        and their height in feet. Based on those inputs, the BMI scale
        will be calculated
        */
        
        Scanner input = new Scanner (System.in);
    
        System.out.println("Input your weight in pounds.");
        double pounds = input.nextDouble();
        
        System.out.println("Input your height in feet as a decimal.");
        double feet = input.nextDouble();

        double kilos = pounds * 0.453592;
        double meters = feet * 0.3048;
        
        double bmi = kilos / (meters*meters);
        
        System.out.println("Your BMI is equal to " + Math.round(bmi));
        
        if (bmi <= 18) {
            System.out.println("According to your bmi results, you are underweight.");
        }
        else if (bmi > 18 && bmi <= 24) {
            System.out.println("According to your bmi results, you are normal.");
        }
        else if (bmi > 24 && bmi <= 29) {
            System.out.println("According to your bmi results, you are overweight.");
        }
        else if (bmi > 30) {
            System.out.println("According to your bmi results, you are obese.");
        }
    }    
}
