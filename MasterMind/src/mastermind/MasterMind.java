package mastermind;

import java.util.Scanner;
import java.util.Random;

public class MasterMind {

	public static void main(String[] args) {

		final String zwart = "zw";
		final String wit = "wi";
		final String geel = "ge";
		final String paars = "pa";
		final String groen = "gr";
		final String blauw = "bl";
		final String oranje = "or";
		final String rood = "ro";

		final String[] colors = { zwart, wit, geel, paars, groen, blauw, oranje, rood };

		final String code1 = "";
		final String code2 = "";
		final String code3 = "";
		final String code4 = "";

		Random code = new Random();

		System.out.println("Please enter your guess for the code!!");
		System.out.println(
				"Available colors: wi (wit), ge (geel), pa (paars), gr (groen), bl (blauw), or (oranje), ro (rood)");
		System.out.println("Enter your guess in the format: wi ge pa bl");

		Scanner sc = new Scanner(System.in);

		String codebreaker1_1 = sc.next();
		String codebreaker1_2 = sc.next();
		String codebreaker1_3 = sc.next();
		String codebreaker1_4 = sc.next();

		String codemaker1_1 = "";
		String codemaker1_2 = "";
		String codemaker1_3 = "";
		String codemaker1_4 = "";

		if (codebreaker1_1.equals(code1)) {
			codemaker1_1 = wit;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("You lost! unfortunate.");
		System.out.println("You won! Congratulations.");

		sc.close();

	}

}
