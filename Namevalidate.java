package org.sathya;
import sattha.lang.NameFormatException;
public class Namevalidate
{
	public void validate(String name)throws NameFormatException
    {
		boolean found=false;
		for(int i=0;i<name.length();i++)
	 {
			char ch=name.charAt(i);
			if(Character.isDigit(ch))
		 {
				found=true;
				break;
		 }
	 }
	 if(found)
	 {
		 NameFormatException no=new NameFormatException("invalid name");
		 throw no;
	 }
	 else
	 {
		 System.out.println("name is valid");
	 }

	}
}
   