package classkques;
import java.util.Scanner;
public class pdf51 {
	int length,breath;
	float radius;
	void rectanglearea(int a,int b)
	{
	System.out.println(a*b);
	}
	void circlearea(float r)
	{
		System.out.println(3.14*r*r);
	}
	void circleperi(float r)
	{
		System.out.println(3.14*2*r);
	}
	void rectangleperi(int a,int b)
	{
	System.out.println(2*(a+b));
	}

public static void main(String[] at)
{
	Scanner sc=new Scanner(System.in);
	pdf51 obj=new pdf51();
	obj.length=sc.nextInt();
	obj.breath=sc.nextInt();
	obj.radius=sc.nextFloat();
	obj.rectanglearea(obj.length,obj.breath);
	obj.rectangleperi(obj.length,obj.breath);
	obj.circlearea(obj.radius);
	obj.circleperi(obj.radius);

}
}
