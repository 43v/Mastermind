package userinput;
import java.util.Scanner;
class Input03 {

    public static void main(String[] args) {
     
         
      Scanner sc = new Scanner(System.in) ;
      
 
   int Getal1 = sc.nextInt();
   int Getal2 = sc.nextInt();
   int Getal3 = sc.nextInt();
   int sum = Getal1 + Getal2 + Getal3;  

   System.out.println(Getal1);
   System.out.println(Getal2);
   System.out.println(Getal3);
   
        sc.close() ;
        //Remember to close the Scanner
        
    }
}
