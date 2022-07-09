//ends with and starts with= return type= boolean
package string_basics;
import java.util.Scanner;
public class a11
{
	public static void main(String[] args) 
	{
		//by taking input from user input
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the string- " );
		String x=s.next().toString();
		
		boolean a=x.startsWith("demo");
		System.out.println(a);
		//System.out.println(x.startsWith("demo"));
		
		boolean b=x.endsWith("cracy");
		System.out.println(b);
		//System.out.println(x.endsWith("cracy"));
		
    }
}

//1. can sense upper and lower case difference
//2. return type must be boolean because it returns only true or false .
//3. no need to print string again.
