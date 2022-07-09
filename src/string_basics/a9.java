//Split method
package string_basics;
import java.util.Scanner;
public class a9 
{
	public static void main(String[] args) 
	{
	//	String a="INDIA*IS*MY*COUNTRY.";
		//String[] b=a.split("*");
		//System.out.println(b);

		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the string to split- ");
		String a=s.next().toString();
		
		String[] y=a.split("=");//return type must be array.
		String x1 = y[0];
		String x2=y[1];
		String x3=y[2];
		String x4=y[3];
		System.out.println(x1);
		System.out.println(x2);
		System.out.println(x3);
		System.out.println(x4);
		
	}
}
