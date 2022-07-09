//Equals method of string=return type =string
package string_basics;

import java.util.Scanner;

public class a2 
{
	public static void main(String[] args) 
	{
		//taking input from user 
		System.out.println("Enter two string to compare by using equals method");
		
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter first string= ");
		String a=s.next().toString();
		
		System.out.print("Enter second string= ");
		String b=s.next().toString();
		
		boolean z=a.equals(b);
		System.out.println(z);
	//	System.out.println(a.equals(b));
		
	}

}
