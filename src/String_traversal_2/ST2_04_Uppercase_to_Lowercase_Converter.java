package String_traversal_2;

import java.util.Scanner;

public class ST2_04_Uppercase_to_Lowercase_Converter 
{
	static  String Uppercase_to_Lowercase_Converter(String s)
	{
		String t="";
		for (int i = 0; i < s.length(); i++)
		{
			char ch=s.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				t=t+(char)(ch+32);
			}
			else
			{
				t=t+ch;
			}
		}
		return t;
	}
	
	public static void main(String[] args)
	{
		 Scanner  scan = new Scanner(System.in);
		 
		 String s=scan.nextLine();
		 
		 String res = Uppercase_to_Lowercase_Converter(s);
	
		 	System.out.println(res);
	}
}
