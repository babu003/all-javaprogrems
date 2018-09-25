import java.util.Scanner;
class SumPairs
{
	public static void main(String... arg)
	{
		int a[]={2,5,14,6,15,18,8,7,5}, n,i,j;

		Scanner  d=new Scanner(System.in);
		System.out.println("enter a number");
		        n=Integer.parseInt(d.nextLine());
		    
		for( i=0;i<a.length;i++)
		{   
			for(j=i+1;j<a.length;j++)
			{
				if((a[i]+a[j])==n)
				{
					System.out.println("("+a[i]+","+a[j]+")");
				}
			
		}
	}

}
}
