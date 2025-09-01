package String_ClassRoom;

import java.util.Scanner;

public class SC10_banana 
{
	static String  banana(String s)
	{
		String t="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch=='a')
			{
				t=t+"*"+ch;
			}
//			else
			{
				t=t+ch;
			}
			
		}
		return t;
	}
	

	public static void main(String[] args) 
	{
		 Scanner  scan = new Scanner(System.in);
 
		 System.out.println("Enter a String: ");
		 String s=scan.next();
		 
		 String res = banana(s);
	
		 	System.out.println(res);
	}

}
