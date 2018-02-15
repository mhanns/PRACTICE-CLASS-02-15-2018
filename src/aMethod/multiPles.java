package aMethod;

import java.util.Scanner;

public class multiPles {
	
	public static void main(String[] args) {
	// TODO Auto-generated method stub

					
		Scanner input = new Scanner(System.in);
				
		System.out.println("We are going to multiply your number/n enter two values. ");
		
		System.out.println("Enter your first number: ");
		int a = input.nextInt();
		System.out.println("Enter your second number: ");
		int b = input.nextInt();
				
								
		System.out.println(a + " multiplied by " + b + " = " + multip(a, b));

						
	}//main
					
	public static double multip(int a, int b){
						
		double result;
		
		result = (a * b);
								
		return result;
		

	}//multip
		
}//class
