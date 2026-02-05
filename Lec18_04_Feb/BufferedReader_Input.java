package Lec18_04_Feb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReader_Input {
	
	public static void main(String[] args)  throws IOException{
		
//		InputStreamReader isr = new InputStreamReader(System.in);
//		BufferedReader br = new BufferedReader(isr);
//		String s=br.readLine();
//		 int i= Integer.parseInt(s);
//		System.out.println(i);
		
//		String s1 = br.readLine();
//		double d= Double.parseDouble(s1);
//		System.out.println(d);
		
//		String s2 = br.readLine();
//		       long l =  Long.parseLong(s2);
		       
		       
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    long l =  Long.parseLong( br.readLine());
    System.out.println(l);



		
	}

}
