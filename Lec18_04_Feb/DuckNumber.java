package Lec18_04_Feb;

import java.util.Scanner;

public class DuckNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
//		boolean flat=false;
		int count=0;
		while(num!=0)
		{
			int rem = num%10;
			if(rem==0)
			{
//				flag=true;
				count++;
				break;

			}
			num=num/10;
		}
		if(count>0)
		System.out.println("Duck Number");
		else
			System.out.println("Not a duck Number");
	}

}
