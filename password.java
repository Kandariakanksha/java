package classkques;
import java.util.Scanner;
public class password {
public static void main(String[] at)
{
	Scanner sc=new Scanner(System.in);
	String str=sc.next();
	int c=0,k=0;
	int length=str.length();
	if(length>=5&&length<=12)
	{
	for(int i=0;i<length;i++)
	{
		if(str.charAt(i)>=48&&str.charAt(i)<=57)
		{
			if(k<5)
			{
			c++;
			}
			else
			{
				c=0;
				k++;
			}
		}
		else if(str.charAt(i)>='a'&&str.charAt(i)<='z'||str.charAt(i)>='A'&&str.charAt(i)<='Z')
		{
			if(c<5)
			{
				k++;	
			}
			else
			{
				k=0;
				c++;
			}
		}
		else
		{
			System.out.println("wrong password");
		}
	}
	}
	else
	{

		System.out.println("wrong password");
	}
}
}
