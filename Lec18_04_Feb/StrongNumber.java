package Lec18_04_Feb;

import java.util.Scanner;

public class StrongNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the Number");
		int num= sc.nextInt();
		
		int sum=0;
		int temp=num;
		while(temp!=0)
		{
			int rem= temp%10;
			int fact=1;
			for(int i=1;i<=rem;i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			temp=temp/10;
		}
		
		if(sum==num)
			System.out.println("Strong Number");
		else
			System.out.println("Not a Strong Number");
	}

}
