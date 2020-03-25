/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question42;

/**
 *
 * @author Filippo
 */
import java.util.Scanner;
        
public class Question42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*This program will determine wether your scores as a baseball player 
        will qualify you to play in an All Stars Game.
        */
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("What is your number of hits?");
        int hits = input.nextInt();
        
        System.out.println("What is your at-bats score?");
        double batter = input.nextDouble();
        
        double score = hits / batter;
        
        if (score >= 0.300) {
            System.out.println("Congratulations! You're eligible for All Stars Game!");
        }
        if (score < 0.300) {
            System.out.println("I'm sorry. You're not eligible for All Stars Game.");
        }
    }
    
}
