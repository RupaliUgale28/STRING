//Program of length method of string=return type =int
package string_basics;
import java.util.Scanner;
public class a3 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter any string to find its length= ");
		
		String a=s.next().toString();
		
		int b=a.length();
		
		System.out.println("Length of the string = " +b);
		//System.out.println(a.length());
		
	}

}
