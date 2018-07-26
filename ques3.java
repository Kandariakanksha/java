package classkques;

public class ques3 {
	
	void s(int a,int b)
	{
		System.out.println("in fun1");
	}
	void s(int a,char b)
	{
		System.out.println("in fun2");
	}
	void s(int a,float b)
	{
		System.out.println("in fun3");
	}
	void s(int a,double b)
	{
		System.out.println("in fun4");
	}
	public static void main(String[] at)
	{
		ques3 ob=new ques3();
		ob.s(1,2);
		ob.s('A', 23);
		ob.s('s', 'a');
		ob.s(2, 9.1f);
		ob.s(2, 9.1);
	}
}

