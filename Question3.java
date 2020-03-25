/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

import java.util.Scanner;

/**
 *
 * @author Filippo
 */
public class Question3 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*This program will ask the user for today's temperature and output 
        wether it is above or below 0 degrees*/
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Input today's temperature:");
        double temperature = input.nextDouble();
        
        if (temperature > 0) {
            System.out.println("The temperature is above 0 degrees.");
        }
        if (temperature < 0) {
            System.out.println("The temperature is below 0 degrees.");
        }
        
     }

}