package string_basics;

import java.util.Scanner;

public class REVERSE_STRING_BY_COUNT {

	public static void main(String[] args) {
		
		int z;
		int count=0;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the string to reverse it= ");
		String a=s.next().toString();
		
		System.out.println("Length of the string= " +a.length());
		System.out.print("String as enter by charAt method= ");
		for(z=0;z<a.length();z++)
		{
		char d=a.charAt(count);
		System.out.print(d);
		count=count+1;
		}
		
		System.out.println();
		
		int count1=(a.length()-1);
		System.out.print("Reverse string by charAt method= ");
		for(z=(a.length()-1);z>=0;z--)
		{
		char d=a.charAt(count1);
		System.out.print(d);
		count1=count1-1;
		}

	}

}
