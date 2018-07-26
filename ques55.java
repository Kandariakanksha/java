package classkques;

import java.util.Scanner;

public class ques55 {
	int age1;
	String name1;
	double marks1;
	static Scanner sc = new Scanner(System.in);
//	ques5()
//	{
//		System.out.print("Default constructor");
//	}
	ques55(int age,String name,double marks)
	{
		age1=age;
		name1=name;
		marks1=marks;
	}
	void display()
	{
		System.out.print("age is"+ age1+ "name is "+name1+"marks is "+marks1);
	}
public static void main(String[] at)
{
	int age;
	String name;
	double marks;
	
		 age=sc.nextInt();
		 name=sc.next();
		 marks=sc.nextDouble();
	ques55 p=new ques55(age,name,marks);
	p.display();
}
}
