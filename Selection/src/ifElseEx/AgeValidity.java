/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifElseEx;

import java.util.Scanner;


public class AgeValidity {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 
    	
    	
    	boolean drivingUnderAge = false;
    	System.out.println("Enter your age");
    	int leeftijd = sc.nextInt(); 
        if (leeftijd >= 18) {
            System.out.println("You are of legal driving age.");
        } else {
            System.out.println("You are under the legal driving age i am in love with you");
        }
    	
    	
  	  sc.close();
}
	

    	
    	
    }

