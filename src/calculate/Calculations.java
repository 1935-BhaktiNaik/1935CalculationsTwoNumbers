package calculate;

import java.util.Scanner;

public class Calculations 
{

	public static void main(String[] args) 
	{
		int number1, number2, result, choice; 
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter two numbers");
		number1 = scan.nextInt(); 
		number2 = scan.nextInt(); 
		
		do
		{
		
			System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n");
			System.out.println("Enter your choice");
			
			choice = scan.nextInt();
			
			switch(choice)
			{
			case 1:
				result = number1 + number2;
				System.out.println("Addition of two numbers = " +result);
				break;
				
			case 2:
				result = number1 - number2;
				System.out.println("Subtraction of two numbers = " +result);
				break;
				
			case 3:
	
				result = number1 * number2;
				System.out.println("Multiplication of two numbers = " +result); 
				break;
			
				
			default:
				System.out.println("You have entered wrong option.Kindly enter from the options provided");
				break;
				
			}
		
		}while(choice!=4);
	}

}
