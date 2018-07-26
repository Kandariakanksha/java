package classkques;

import java.util.Scanner;

public class ques5 {
	int age1;
	String name1;
	double marks1;
    
//	ques5()
//	{
//		System.out.print("Default constructor");
//	}
	void insert(int age,String name,double marks)
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
	Scanner sc = new Scanner(System.in);
		 age=sc.nextInt();
		 name=sc.next();
		 marks=sc.nextDouble();
	ques5 p=new ques5();
	p.insert(2,"ak",12.2);
	p.display();
}
}
