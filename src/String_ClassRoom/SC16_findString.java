package String_ClassRoom;

import java.util.Scanner;

public class SC16_findString 
{
	
	
	static String find_String(String s,String t)
	{
		int i=0,j=0;
		while(i<s.length()  &&  j<t.length())
		{
			if(s.charAt(i)==t.charAt(j))
			{
				i++;
				j++;
			}
			else
			{
				i++;
			}
		}
		
		return j==t.length()? "yes" : "no" ;
	}

	public static void main(String[] args) 
	{
		 Scanner scan = new Scanner(System.in);
	       System.out.println("Enter a String: ");
	       String s=scan.nextLine();
	       
	       String t=scan.nextLine();
			 
			String res =  find_String(s,t);
		
			System.out.println(res);
	}

}
