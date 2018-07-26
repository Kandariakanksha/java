package classkques;
import java.util.Scanner;
public class frequency_of_num {
	public static void main(String[] at)
	{
		int a[]=new int[50];
		int countofnum=0,temp;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();	
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();	
		}	
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
			if(a[j+1]>a[j])
			{
			temp=a[j];
			a[j]=a[j+1];
			a[j+1]=temp;
			}
			}
		}
			int j=0;
	for(int z=0;z<n;z++)
	{
		j=z;
		while(a[z]==a[j])
		{
			countofnum++;
			j++;
		}
		System.out.println("count of num "+a[z]+"is"+countofnum);
	    z=j-1;
		countofnum=0;
	}
	}
	}
