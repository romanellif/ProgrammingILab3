/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question52;

import java.util.Scanner;

/**
 *
 * @author Filippo
 */
public class Question52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*This program will ask the user for a user ID and password. Depending
        on wether the user knows the right user ID and password, the program 
        will either sign the user in, if correct. Warn the user if the password 
        or User ID is incorrect. As well as, if both the User ID and password are 
        incorrect.
        */
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Input your User ID:");
        String user = input.nextLine();
        
        System.out.println("Input your password:");
        String password = input.nextLine();
        
        
        
        String admin = "admin"; 
        String open = "open";
        
        if (user.equals(admin) && password.equals(open)) {
            System.out.println("Welcome.");
        }
        if (user.equals(admin) && (password == null ? open != null : !password.equals(open))) {
            System.out.println("Your password is incorrect.");
        }
        if ((user == null ? admin != null : !user.equals(admin)) && password.equals(open)) {
            System.out.println("Wrong User ID.");
        }
        if ((user == null ? admin != null : !user.equals(admin)) && (password == null ? open != null : !password.equals(open))) {
            System.out.println("Sorry, Wrong ID and password");
        }
    }
    
}
