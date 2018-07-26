package classkques;
import java.util.Scanner;
abstract class akanksha { //difference between private and final is that you can only use private with functions and datatypes not with class but final assures no access to the class.you cannot use private with class. 
	int n1,n2;
	void set(int a,int b)
	{
		n1=a*a*a;
		n2=b*b;
	}
	abstract void adi();//yha p define na kro thali meri lekin khana aapka
	
}
public class inheritance extends akanksha{
	static int i,j;
	void adi()
	{
		
	}
	inheritance()
	{ 
	 set(2,4);//if we want to use the parent wala set function then write super.set()
	}
	public static void main(String[] at)
	{
	//new akanksha(); cannot make an object of abstract class and you have to inherit it
		new inheritance();
		
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
		System.out.print(i);
	}
	void set(int a,int b) //function overriding
	{
		i=a*a*a;
		j=b*b;
	}
	}

