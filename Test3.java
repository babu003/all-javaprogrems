class Test 
{
    int a,b;
	Test(int a,int b)
	{
		this.a=a;
		this.b=b;
		this.a=this.a+1;
		this.b=this.b+1;
		a=a+4;
		b=b+4;
		System.out.println("value of a is="+a);
		System.out.println("value of b is="+b);

		
	}
	Test()
	{
		a=b=0;
	}
	void sum(Test t,Test h)
	{
		this.a=t.a+h.a;
		this.b=t.a+h.b;
	}
	void display()
	{
		System.out.println("value of a is="+a);
		System.out.println("value of b is="+b);
	}


}
public class Test3
{
	public static void main(String args[])
	{   System.out.println("formal parameters of first object");
		Test t1=new Test(9,7);
		System.out.println("object t1 values");
		t1.display();
		System.out.println("formal paramaters of second object");
		Test t2=new Test(5,5);
		System.out.println("object t2 values\n");
             t2.display();
		Test t3=new Test();
		System.out.println("object t3 values");
		t3.sum(t1,t2);
        t3.display();
	}
}
