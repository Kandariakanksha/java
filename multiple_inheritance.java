package classkques;
import java.util.Scanner;
interface multiple_inheritance {
	final int a=5;
	public void show();
}
class p1
{
	void delhi()
	{
		System.out.print("hi delhi");
	}
}
class ak extends p1 implements multiple_inheritance
{
	static int a,b;
	static int sum;
	public static void main(String[] at)
	{
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
	}
		void sum()
		{
			sum=a+b;
		}
		public void show()
		{		
	    System.out.print(sum);
	    delhi();
	    }
}

