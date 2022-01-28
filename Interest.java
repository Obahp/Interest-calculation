package week3;

import java.util.Scanner;

public class Interest {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter the amount to be deposited each month:");
		double a = Double.parseDouble(in.nextLine());
		
		System.out.println("Please enter the annual interest rate percent:");
		double b = Double.parseDouble(in.nextLine());
		
		
		double c = a*(1 + 0.001416);
				
		double d = (a+c)*(1 + 0.001416);
				
		double e = (a+d)*(1 + 0.001416);
		
		System.out.println("The ending balance after 6 months is: " + e);
		
		in.close();
	}

}
