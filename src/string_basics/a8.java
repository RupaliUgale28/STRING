//Program for concat method of string
package string_basics;
import java.util.Scanner;
public class a8 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter first string= ");
		String a=s.next().toString();
		
		System.out.print("Enter second string to cancate= ");
		String b=a.concat(" is secular country.");
		System.out.println(b);
		//System.out.println(a.concat(" is secular country."));

	}

}
