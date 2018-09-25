import java.util.Scanner;
class  
{
	public static void main(String[] args) 
	{
		 int n1,n2,sp;
		 Scanner in=new Scanner(System.in);
		 System.out.println("enter number of rows");
		 n1=Integer.parseInt(in.nextLine());
		 System.out.println("enter number of columns");
		     n2=Integer.parseInt(in.nextLine());
		int a[][]=new int[n1][n2];
		for(int i=0;i<n1;i++)
		{
			for(int j=0;j<n2;j++)
			{
				a[i][j]=Integer.parseInt(in.nextLine());
				System.out.println(a[i][j]);
			}
		}
		for(int i=0;i<n1;i++)
		{
			 sp=a[i][0];
			for(int j=1;j<n2;j++)
			{
			
				if(sm>a[i][j])
				{
					sm=a[i][j+1];
				}
			}
			while(i<n1)
			{
				if(sm<a[i][j])
				{



	}
}
