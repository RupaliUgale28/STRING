//Equal_ignore_case
package string_basics;
import java.util.Scanner;

public class a1 {

	public static void main(String[] args) 
	{
		//by directly declaring string here
		//String a="India";
		//String b="INDIA";
		//System.out.println(a.equalsIgnoreCase(b));//OUTPUT= true
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string1");
		String a=s.next().toString();
		
		System.out.println("enter the string2");
		String b=s.next().toString();
		
		System.out.println(a.equalsIgnoreCase(b));

	}

}
