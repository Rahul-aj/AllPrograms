package String_ClassRoom;

import java.util.Scanner;

public class SC15_keep_one_space
{
	static String keep_one_space(String s)
	{
		String t="";
		int si=0,ei=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				si=i;
				break;
			}
		}
		for(int i=s.length()-1;i>=0;i--)
		{
			if(s.charAt(i)!=' ')
			{
				ei=i;
				break;
			}
		}
		for(int i=si;i<=ei;i++)
		{
			if ((s.charAt(i)==' '  &&   s.charAt(i+1)!=' ')   ||  (s.charAt(i)!=' '))
			{
				 t=t+s.charAt(i);
			}
		}
		return t;	
	}

	public static void main(String[] args) 
	{
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter a String: ");
       String s=scan.nextLine();
		 
		String res = keep_one_space(s);
	
		System.out.println(res);
	}
}
