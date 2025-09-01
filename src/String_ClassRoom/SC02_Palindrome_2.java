package String_ClassRoom;

import java.util.Scanner;

public class SC02_Palindrome_2 
{
	
	 static void isPalindrome2(String str)
	{
		String t="";
		for(int i=str.length()-1;i>=0;i--)
		{
			t=t+str.charAt(i);
		}
		if(t.equals(str))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("..... not a palindrome");
		}
	}

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);

		 System.out.println("Enter a String: ");
		 String str=scan.next();
	
		 
		 isPalindrome2(str);
		
	}

}
