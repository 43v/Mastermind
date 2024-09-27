/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifElseEx;

import java.util.Scanner;

public class ChkOddEven {

    public static void main(String args[]) {

    	Scanner in = new Scanner(System.in); 
    	
          
        System.out.println("Enter a number:");
        int num = in.nextInt(); 
        
   
        
        System.out.println("Lets see if your number is an odd number or an even!");
        

  
  if (num > 0) {
      if (num % 2 == 0) {
          System.out.println(num + " is an even number!");
      } else {
          System.out.println(num + " is an odd number!");
      }
  }
     
        
       
        
        
        
        
        in.close();

    }
}
