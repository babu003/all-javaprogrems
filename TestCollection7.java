import java.util.*;  
public class TestCollection7
	{  
 public static void main(String args[])
	 {  
  
  LinkedList  al=new LinkedList();  
  al.add("Ravi");  
  al.add("Vijay");  
  al.add("Ravi");  
  al.add("Ajay");
  
  Collections.sort(al);
  
  
	         Object obj[]=al.toArray();
			 for(int i=0;i<obj.length;i++)
		 {
			 System.out.println(obj[i]);
		 }
		 
 }  
}  
