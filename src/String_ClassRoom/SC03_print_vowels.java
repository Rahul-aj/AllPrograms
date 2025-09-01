package String_ClassRoom;

import java.util.Scanner;

public class SC03_print_vowels 
{
	static void print_vowels(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o'  || ch=='u'  
		     ||ch=='A' || ch=='E' || ch=='I' || ch=='O'  || ch=='U')
			{
				System.out.print(ch);
			}
		}
	}
	

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);

		 System.out.println("Enter a String: ");
		 String s=scan.next();
		 
		 print_vowels(s);
		 
	}

}
