package String_ClassRoom;

import java.util.Scanner;

public class SC04_count_vowels 
{

	static int  count_vowels(String s)
	{
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);

			if(ch=='a' || ch=='e' || ch=='i' || ch=='o'  || ch=='u'  
		     ||ch=='A' || ch=='E' || ch=='I' || ch=='O'  || ch=='U')
			{
				count++;
			}		
		}
		return count;
	}

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);

		 System.out.println("Enter a String: ");
		 String s=scan.next();
		 
		 int res=count_vowels(s);
		 System.out.println(res);
	}

}
