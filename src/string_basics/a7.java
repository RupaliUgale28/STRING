//CharAt method of string=== return type ==string
package string_basics;
import java.util.Scanner;
public class a7 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter any string= ");
		String a=s.next().toString();
		
		char b=a.charAt(4);
		System.out.println(b);
	}
}
//works as per index value which starts from zero.
//