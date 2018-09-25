abstract class X
{
     X()
    {
        System.out.println("ONE");
    }
     
    abstract void abstractMethod();
}
 
class Y extends X
{
     Y() 
    {
        System.out.println("TWO");
    }
     
    @Override
    void abstractMethod()
    {
        System.out.println("THREE");
    }
}
 
public class MainClass
{
    public static void main(String[] args)
    {
        X x = new Y();
         
        x.abstractMethod();
    }
}
