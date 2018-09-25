import java.util.Scanner;
class Addition
{
	void cal(int x,int y)
	{
		System.out.println(x+"\t"+y);
		System.out.println("addtion of two number"+(x+y));
	}
}
class Substration extends Addition
{
	void cal(int x,int y)
	{
		super.cal( x, y);
		System.out.println(x+"\t"+y);
		System.out.println("substration  of two number"+(x-y));
	}

}
class Multiplication extends Substration
{
	void cal(int x,int y)
	{
		super.cal( x, y);
		System.out.println(x+"\t"+y);
		System.out.println("multiplication of two number"+(x*y));
	}
}
class Division extends Multiplication
{
	void cal( int x,int y)
	{

		super.cal( x, y);
		System.out.println(x+"\t"+y);
		float dc=x/y;
		System.out.println("division of two number"+dc);
	}
}

class ArithmeticOp 
{
	public static void main(String[] args) 
	{  
		Scanner s=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int i=Integer.parseInt(s.nextLine());
		int j=Integer.parseInt(s.nextLine());
        Division d1=new Division();
		       d1.cal(i,j);

	}
}
