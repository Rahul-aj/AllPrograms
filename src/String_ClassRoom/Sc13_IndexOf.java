package String_ClassRoom;

import java.util.Scanner;

public class Sc13_IndexOf 
{
	static int IndexOf(String s,char k)
	{
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch==k)
			{
				return i;
			}
			
		}
		return -1;
	}

	public static void main(String[] args)
	{
		

		 Scanner  scan = new Scanner(System.in);
		 
		 System.out.println("Enter a String: ");
		 String s=scan.next();
		 char k=scan.next().charAt(0);
		 
		 int res = IndexOf(s,k);
	
		 	System.out.println(res);
	}

}
