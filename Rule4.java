class  Bc
{
	int a;
	Bc(int a)
	{
		this.a=a;
		System.out.println("bc.....dc");
		System.out.println("value of a"+this.a);
	}
} 
class Dc extends Bc
{
	int b;
	Dc()
	{
		super(5);
		b=12;
		System.out.println("dc to dc");
		System.out.println("value of b is"+b);
	}
}
class Rule4
{
	public static void main(String args[])
	{
		Dc ob=new Dc();
    }

	
}
