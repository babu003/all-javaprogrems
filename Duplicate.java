import java.util.Scanner;
class Duplicate 
{
	public static void main(String[] args) 
	{
		int i;
		int a[]={1,2,3,2,4,1};
		for(i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
			    if(a[i]==a[j])
			   {
					System.out.println(a[i]);
			   }
			}

	  }
	}
}
