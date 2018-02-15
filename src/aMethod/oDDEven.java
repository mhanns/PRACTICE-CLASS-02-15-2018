package aMethod;

import java.util.Scanner;

public class oDDEven {

	public static void main(String[] args) {
	// TODO Auto-generated method stub

					
	Scanner input = new Scanner(System.in);
				
				
	System.out.println("Enter a number - - ");

	System.out.println("- I will tell you if its Odd or Even");
	int numb = input.nextInt();
				

								
	System.out.println("Is the number EVEN? ---> " + Even(numb));

							
	}//main
					
	public static boolean Even(int numb){
						
		boolean value;
						
		if (numb % 2 == 0){
					
			value = true;
			}
		else 
			{
			value = false;
		}
						
				return value;
		

	}
		
}
