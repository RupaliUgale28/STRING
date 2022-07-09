//REVERSE STRING PROGRAM
package string_basics;

import java.util.Scanner;

public class REVERSE_STRING {

	public static void main(String[] args) {
		
		
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the any string to reverse= ");
		String name=s.next().toString();
		
		String reverse_string="";
		
		System.out.println("Length of the string= " +name.length());
		
		for(int i=(name.length()-1);i>=0;i--)
		{
			reverse_string=reverse_string+name.charAt(i);
		}
		System.out.println("Reverse string is= " +reverse_string);
	}

}
