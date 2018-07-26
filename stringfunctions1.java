package classkques;
import java.util.Scanner;
public class stringfunctions1 {
public static void main(String[] at)
{
	final String a="aman";//final can be used only once and cannot be modified in any way.
	Scanner s=new Scanner(System.in);
	String str=s.next();
	int b=str.length();
	str=str.trim();
	int c=str.length();
	System.out.println("prev length"+b+"new length "+c);
	if(str.contains("aman"))
	{
		System.out.println("contains aman");
	}
	else
	{
		System.out.println("does not contain aman");
	}
	if(str.indexOf("@")==-1)
	{
		System.out.println("@ thus error");
	}
	else
	{
		if(str.equals(a))
		{
			System.out.println("correct password");
		}
		else
		{
			System.out.println("incorrect");
		}
	}
	
	
}
}
