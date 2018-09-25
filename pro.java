import java.util.*;
import java.io.*;
class Pro
{
	public static void main(String args[])throws Exception
	{
		FileReader  fi=new FileReader("g.Prop");
		Properties p=new Properties();
		p.load(fi);
		System.out.println(p.getProperty("user"));
		System.out.println(p.getProperty("password"));

}
}