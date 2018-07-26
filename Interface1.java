package classkques;

interface Interface1 {
final int ii=10;
void show();
}
class B
{
	int i=10,j=10;
	B()
	{
		System.out.println("hello");
	}
}
class A extends B implements Interface1
{
	A()
	{
		super();//isse upar kuch nhi otherwise error
		int q = super.i;
		show();
	}
	final int b=10;
	int i=29;
	public static void main(String[] at)
	{
		new A();
		//System.out.println(i);

		//show();
	}
	public void show()
	{
		System.out.println("hiii");
	}
}
