package Lec15_30_Jan;

import java.util.Scanner;

public class OperationOnTwoNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Operator");
		char operator=sc.next().charAt(0);
		System.out.println("Enter the First Number: ");
		int num1=sc.nextInt();
		System.out.println("Enter the Second Number: ");
		int num2=sc.nextInt();
		
		switch(operator)
		{
		case '+': System.out.println(num1+num2);
		break;
		case '-': System.out.println(num1-num2);
		break;
		case '*': System.out.println(num1*num2);
		break;
		case '/': 
			{
				if(num2!=0)
				System.out.println(num1/num2);
				else
					System.out.println("Cannot divide by zero");
			}
		break;
		case '%': System.out.println(num1%num2);
		break;
		case '^': System.out.println(Math.pow(num1, num2));
		break;
		default: System.out.println("Operator not matched");
		
		}
	}

}
