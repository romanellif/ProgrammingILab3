/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question47;

/**
 *
 * @author Filippo
 */
import java.util.Scanner;

public class Question47 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*This program will prompt the user to create a password.
        If the user eneters the password correctly 2 times in a row, the user
        will be registered as a new memeber. If there're a typo in the 
        second try, the user will be warned of the mistake.
        */
        
        Scanner input = new Scanner (System.in);

        System.out.println("Create a new password for your account:");
        String password = input.nextLine();

        System.out.println("Confirm your new password by retyping it:");
        String password1 = input.nextLine();

        if (password.equals(password1)) {
            System.out.println("You are now registered as a new user!");
        }
        if (password == null ? password1 != null : !password.equals(password1)) {
            System.out.println("Sorry, there is a typo in your password.");
        }
    }
    
}
