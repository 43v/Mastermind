
package kipopdracht;

public class Chickens01 {
    public static void main(String[] args) {
     
    	int eggsPerChicken = 5;
    	int chickenCount = 3;
        int totalEggs = 0;
    	
        String Dag_1 = "Dag 1";
        System.out.println(Dag_1);		
        
        totalEggs= eggsPerChicken * chickenCount;
        String Wat1 = "Je hebt "totalEggs" eieren";
        
        System.out.println(Wat1);		
 
        String Dag_2 = "Dag 2";
        
        System.out.println(Dag_2);	
        chickenCount ++;
        
        String nieuwe = "Je hebt een nieuwe kip";
       System.out.println(nieuwe);
       
       String Dag_3 = "Dag 3";
       
       System.out.println(Dag_3);	
      
       
 	  
       String Wat3 = "Een vos eet de helft van je kippen";
      
       System.out.println(Wat3);	
       chickenCount /= 2;
       
       
       totalEggs = chickenCount * eggsPerChicken;
       
      System.out.println("Je hebt nu " + totalEggs+" eggs!");
    
     
    }   
}
