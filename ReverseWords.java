import java.util.Scanner;
class ReverseWords
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter string ");
			String str=s.nextLine();
		String[] words=str.split(" ");
		String reverseString="";
		for(int i=0;i<words.length;i++)
		{
			String word=words[i];
			String reverseWord="";
			for(int j=word.length()-1;j>=0;j--)
			{
				reverseWord=reverseWord+word.charAt(j);
			}
			reverseString=reverseString+reverseWord+" ";
		}
			System.out.println(str);
		System.out.println(reverseString);
	}

}