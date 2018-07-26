package classkques;
public class locker {
public static void main(String[] at)
{
	int a[]=new int[50];
	for(int i=0;i<50;i++)
	{
		if(i==0||i==1)
		{
			a[i]=1;
			for(int j=i+1;j<50;j++)
			{
				if(a[j]==0)
				{
					a[j]=1;
				}
			}
		
		}
		
		else
		{
			a[i]=1;
			for(int j=i+1;j<50;j=j+i)
			{
				if(a[j]==1)
				{
					a[j]=0;
				}
				else
				{
					a[j]=1;
				}
			}

		}
		for(int k=0;k<50;k++)
		{
	      System.out.print(a[k]);
		}
		System.out.println();
	}
	for(int i=0;i<50;i++)
	{
      System.out.print(a[i]);
	}
}
}
