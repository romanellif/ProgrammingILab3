/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question5;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Filippo
 */
public class Question5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*This program will prompt the user for their date of birth, the 
        program will then calculate how long ago was your birthday,
        and also how far away it is.
        */
        Scanner input = new Scanner (System.in);
        
        System.out.println("Input your year of birth?");
        int yearOfBirth = input.nextInt();
        
        System.out.println("Input your birthday month as a number: (Eg:00=January)");
        int month = input.nextInt();
        
        System.out.println("Input your day of birth");
        int day = input.nextInt();
        
        Date today = Calendar.getInstance().getTime(); 
        int year = Calendar.getInstance().get(Calendar.YEAR);
        
        int age = year - yearOfBirth;
        
        System.out.println("Your age is " + age + " years old.");
        
        System.out.println("Your birthday was " + 
                          (day - (Calendar.getInstance().get(Calendar.DATE))) + 
                           " day(s) ago, and " +
                          (Calendar.getInstance().get(Calendar.MONTH) - month + 12)
                           + " month(s) ago.");
        
        System.out.println("Your birthday is in " + 
                           (day - Calendar.getInstance().get(Calendar.DATE))
                           + " days, and " + 
                           (month - (Calendar.getInstance().get(Calendar.MONTH)))
                           + " month(s).");                                                        
                         
    }
    
}
