/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question4;

import java.util.Scanner;

/**
 *
 * @author Filippo
 */
public class Question4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*This program will prompt the user to pick one of the following
        calculation methods. The program will then calculate what the user has
        chosen after he enters his inputs.
        */
        Scanner input = new Scanner (System.in);
        
        System.out.println("Pick one of the following conversions:");
        System.out.println("1. Meters to Feet");
        System.out.println("2. CAD to USD");
        System.out.println("3. Celsius to Farenheit");
        System.out.println("4. Milliliters to Liters");
        System.out.println("5. CAD to EUR");
    
        double option = input.nextDouble();
        
        /*The first one is a conversion method from meters to feet*/
        if (option == 1) {
            System.out.println("Input the meters:");
            double meters = input.nextDouble();
            double feet = meters * 3.28084;
            System.out.println(meters + " meters converted into feet is "
                               + " equal to " + Math.round(feet));
        }
        /*The second one is a conversion method from Canadian Dollars to American*/
        if (option == 2) {
            System.out.println("Input CAD amount");
            double cad = input.nextDouble();
            double usd = cad * 0.72;
            System.out.println(cad + " Canadian dollars converted into American "
                                + usd + " dollars.");
        }
        /*The third one will convert Celsius to Farenheit*/
        if (option == 3) {
            System.out.println("Input the temperature in Celsius:");
            double celsius = input.nextDouble();
            double farenheit = (celsius * (9/5)) + 32;
            System.out.println(celsius + " degrees converted into Farenheit is "
                               + " equal to " + farenheit);
        }   
        /*The fourth one will convert Milliliters to Liters*/
        if (option == 4) {
            System.out.println("Input the amount of Milliliters:");
            double milliliters = input.nextDouble();
            double liters = milliliters * 0.001;
            System.out.println(milliliters + " millitiers converted to liters is "
                               + " equal to " + Math.round(liters) + " liters.");
        }
        /*The fifth one will convert Canadian Dollars to Euros*/
        if (option == 5) {
            System.out.println("Enter the amount in CAD:");
            double cad = input.nextDouble();
            double usd = cad * 0.72;
            System.out.println(cad + " Canadian dollars converted into American "
                                + usd + " dollars.");
        }
    }
    
}
