import java.util.Scanner;
class DTH
{
	public static void main(String args[])
	{Scanner s1=new Scanner(System.in);
		int n,i=0;
		 Object[] a = new Object[10];;
		System.out.println("enter a value");
		n=Integer.parseInt(s1.nextLine());
		while(n>0)
		{
			int tem=n%16;
			if(tem<=9)
			{
				a[i]=tem;
			}
			else
			{
				switch(tem)
				{
					case 10:a[i]="A";
					break;
					case 11:a[i]="B";
					break;
					case 12:a[i]="C";
					break;
					case 13:a[i]="D";
					break;
					case 14:a[i]="E";
					break;
					case 15:a[i]="F";
					break;
				}
			}
			n=n/16;
			i++;
		}
		for(int j=i-1;j>=0;j--)
		{
			System.out.println(a[j]);
		}
	}
}