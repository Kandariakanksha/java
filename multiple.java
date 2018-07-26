package classkques;
import java.util.Scanner;
	interface multiple_inheritance {
		final int a=5;
		void show();//public lgane ki jarurat nhi h
	}
	class p1
	{
		static void delhi()
		{
			System.out.println("hi delhi");
		}
	}
  class multiple extends p1 implements multiple_inheritance
	{
		static int a,b;
		static int sum;
		multiple()
		{
			show();
		}
		public static void main(String[] at)
		{
			Scanner s=new Scanner(System.in);
			a=s.nextInt();
			b=s.nextInt();
			sum();
			new multiple();
		}
			static void sum()
			{
				sum=a+b;
			}
			public void show()
			{		
		    System.out.println(sum);
		    delhi();
		    }
	}

