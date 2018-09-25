 import java.util.Scanner;
 class  DTB
{ 
	
	public static void main(String[] args) 
	{
		int i = 0,no;
			Scanner in=new Scanner(System.in);
		System.out.println("enter value ");
		no=Integer.parseInt(in.nextLine());
		int a[]=new int[no];
    while (no > 0) 
		{
           a[i] = no%2;
             i++;
            no = no/2;
         }
       for (int j = i -1 ; j >= 0 ; j--)
		{
               System.out.print(a[j]);
       }
    }
	}
