abstract class A
{
	abstract void a1();
	void a2()
	{
	}
}
 abstract class B extends A
{
	void a1()
	{

	}
	void a2()
	{

	}
}
class C extends B
{
	void c1()
	{
        System.out.println("drt");
	}
}
class D
{
	public static void main(String... args)
	{
		//A x=new B();
		C y=new C();
		A z=new C();
		//x.a2();
		z.a2();
		//z.c1();
		z.a1();
		y.c1();
	}

}
