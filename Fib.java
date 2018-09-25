import java.util.Scanner;
class Fib
{
public static void main(String ar[])
{Scanner s=new Scanner(System.in);
int a=0,b=1,c=0;
int n=s.nextInt();
System.out.print(a+" "+b);
for(int i=0;i<n;i++)
{
c=a+b;
a=b;
b=c;
System.out.print(" "+c);
}
}
}