import java.util.Scanner;
class  DecToBin
{
	public static void main(String[] args) 
	{ int i,n,n1;
		Scanner in=new Scanner(System.in);
		System.out.println("enter value ");
		n=Integer.parseInt(in.nextLine());
		int a[]=new int[n];
		for( i=0;n>=0;i++)
		{
	    		n1=n%2;
				n=n/2;
			a[i]=n1;
	    }
		for( i=0;i<a.length;i++);
		{
			System.out.print(a[i]);
		}
   }
}
