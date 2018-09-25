import java.util.Scanner;
class Bubblesort 
{
	public static void main(String[] args) 
	{int n;
		Scanner s=new Scanner(System.in);
		System.out.println("enter how many values to be sorted");
		n=Integer.parseInt(s.nextLine());
		int a[]=new int[n];
		System.out.println("enter values before sorting");
		for(int i=0;i<n;i++)
		{
			a[i]=Integer.parseInt(s.nextLine());
			//System.out.println(a[i]);
		}
		for(int i=0;i<(n-i);i++)
		{
			for(int j=0;j<(n-j);j++)
			{
				if(a[j]>a[j+1])
				{
					int t=a[j+1];
					a[j+1]=a[j];
					a[j]=t;
				}
			
            }
	}
	System.out.println("after sorting");
	for(int i=0;i<n;i++)
		{
		  
			   System.out.print(" "+a[i]);
		}
}
}
