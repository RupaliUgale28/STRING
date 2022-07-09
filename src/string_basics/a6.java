//Program of replace method of string== return type ==string
package string_basics;
import java.util.Scanner;
public class a6 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the string= ");
		
		String a=s.next().toString();
		
		String c=a.replace('s','c');
		System.out.println("Replaced string = " +c);
	}
}
//here we can replace the whole string also...but most of the it used for char replacement..
//