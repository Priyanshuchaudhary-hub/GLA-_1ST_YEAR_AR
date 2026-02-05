package Lec17_03_Feb;

import java.util.Scanner;

public class SumOfDigit {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
//		int count=0;
		int sum =0;
		while(num!=0)
		{
			int rem = num%10;
			sum = sum+rem;
//			count++;
			num=num/10;
		}
		System.out.println("The Sum of Digit are "+sum);
		
		
	}

}
