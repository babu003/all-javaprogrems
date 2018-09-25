package sp1;
public class Div
{
	public void div(String s1,String s2)throws ArithmeticException
	{
		int a=Integer.parseInt(s1);
		int b=Integer.parseInt(s2);
		if(b==0)
		{
			ArithmeticException ae=new ArithmeticException("dont enter by zero value");
			throw ae;
		}
		else
		{
			int c=a/b;
			System.out.println("division of numbers is"+c);
		}

}
}

