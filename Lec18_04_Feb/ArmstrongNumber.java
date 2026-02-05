package Lec18_04_Feb;

import java.util.Scanner;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		int count=0;
		int temp=num;
		int temp1=num;
		while(temp!=0)
		{
			count++;
			temp=temp/10;
		}
		
		double sum=0;
		while(temp1!=0)
		{
		int rem=temp1%10;
		 sum = sum+Math.pow(rem, count);
		 temp1=temp1/10;
		}
		
		if(sum==num)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not an Armstrong Number");
	}

}
