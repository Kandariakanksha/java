package classkques;
import java.util.Scanner;
public class pdf5_2 {
	int length,breath;
	float radius;
	int calculateArea(int l,int b)
	{
		int area=l*b;
		return area;
	}
	double calculateArea(float r)
	{
		double area=3.14*r*r;
		return area;
	}
	int calculatePeri(int l,int b)
	{
		int peri=2*(l+b);
		return peri;
	}
	double calculatePeri(float r)
	{
		double peri=2*3.14*r;
		return peri;
	}

public static void main(String[] at)
{
	Scanner sc=new Scanner(System.in);
	pdf5_2 obj=new pdf5_2();
	obj.length=sc.nextInt();
	obj.breath=sc.nextInt();
	obj.radius=sc.nextFloat();
	int a=obj.calculateArea(obj.length,obj.breath);
	double b=obj.calculateArea(obj.radius);
	int x=obj.calculatePeri(obj.length,obj.breath);
	double y=obj.calculatePeri(obj.radius);
	System.out.println(a);
	System.out.println(b);
	System.out.println(x);
	System.out.println(y);
}
}
