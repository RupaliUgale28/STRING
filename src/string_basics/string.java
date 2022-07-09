
//practice all string methods
package string_basics;

public class string 
{

	public static void main(String[] args) 
	{
		String a="saurabh";
		String b="SauraBH";
		System.out.println(a.equalsIgnoreCase(b));//true
		System.out.println(a.equals(b));//false
		System.out.println(a==b);//false************
		System.out.println(a.length());//7
		System.out.println(b.toLowerCase());//saurabh
		System.out.println(a.toUpperCase());//SAURABH
		System.out.println(a.startsWith("sau"));//true
		System.out.println(b.endsWith("abh"));//false
		System.out.println(a.replace('s', 'S'));//Saurabh
		System.out.println(b.replace("Saura", "SAURA"));//SAURABH
		System.out.println(a.charAt(6));//h=6 index
		System.out.println(a.trim());//saurabh
		
		//String z="INDIA@IS@MY@COUNTRY";
		
		String z="INDIA\\* IS\\* MY\\* COUNTRY";
		String[] y=z.split("\\* ");//******
	
		String x1=y[0];
		System.out.print(x1);
		String x2=y[1];
		System.out.print(x2);
		String x3=y[2];
		System.out.print(x3);
		String x4=y[3];
		System.out.print(x4);//INDIAISMYCOUNTRY
	

	}

}
