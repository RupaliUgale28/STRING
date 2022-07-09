//Lower case and Upper case methods
package string_basics;
import java.util.Scanner;
public class a10 
{
	public static void main(String[] args) 
	{
		//initializing string here only
		String a="DemocracY";
		System.out.println("Converted into lower case- " +a.toLowerCase());
		System.out.println("Converted into upper case- " +a.toUpperCase());
		
		//by taking input from user
		Scanner s=new Scanner(System.in);
		System.out.print("\n"+ "Enter the string- ");
		String f=s.next().toString();
	//	String h=f.toLowerCase();
	//	String i=f.toUpperCase();
		System.out.println("Lower case- " +f.toLowerCase());
		System.out.println("Upper case- " +f.toUpperCase());
		
	}
}
