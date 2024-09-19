package chickenopdracht2;

import java.util.Scanner;
public class Chickens02 {
	
    public static void main(String[] args) {
  

    	  Scanner sc = new Scanner(System.in)
          		;
      	System.out.println("Hoeveel eieren heb je op dag 1?");
      	int eggsDay1 = sc.nextInt();
      	System.out.println("Hoeveel eieren heb je op dag 2?");
      	int eggsDay2 = sc.nextInt();
      	System.out.println("Hoeveel eieren heb je op dag 3?");
      	int eggsDay3 = sc.nextInt();
    	
    	double dailyAverage = (eggsDay1+eggsDay2+eggsDay3)/3.0;
    	
    	double monthlyAverage = dailyAverage*30;
    	
    	double monthlyProfit = monthlyAverage*0.18;
    	
    	
    	
        System.out.println("Daily Average:   " +dailyAverage);
        System.out.println("Monthly Average: " +monthlyAverage);
        System.out.println("Monthly Profit:  " +monthlyProfit);
        
        
        sc.close() ; 
    }
    
}
