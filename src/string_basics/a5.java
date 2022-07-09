//Program of trim method of string==return type = string
package string_basics;
import java.util.Scanner;
public class a5 
{
	public static void main(String[] args) 
	{
		System.out.println("Program of trim method of string");

		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter  string=");
		String a=s.next().toString();
		
		String b=a.trim();
		System.out.println("Trimed string=" +b);

	}

}
//not remove space in betn the string
//