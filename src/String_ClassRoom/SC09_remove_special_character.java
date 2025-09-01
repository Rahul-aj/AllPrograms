package String_ClassRoom;

import java.util.Scanner;

public class SC09_remove_special_character 
{

	static String remove_special_character(String s)
	{
		String t="";
		for (int i = 0; i < s.length(); i++) 
		{
			char ch=s.charAt(i);
			if(  (ch>='A'  && ch<='Z')   ||  (ch>='a'  && ch<='z') ||      (ch>='0'  && ch<='9')   )
			{
				t=t+ch;
			}
		}
		return t;
	}
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		 
		 System.out.println("Enter a String: ");
		 String s=scan.next();
		 
		 String res = remove_special_character(s);
	
		 	System.out.println(res);
		 
	}

}
