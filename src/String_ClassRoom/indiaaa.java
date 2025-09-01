package String_ClassRoom;

import java.util.Scanner;

public class indiaaa 
{

	static void  revers(String s)
	{
		String t="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch!=' ')
			{
					t=t+ch;
			}
			else
			{ 
				for(int j=t.length()-1;j>=0;j--)
				{
					char a=t.charAt(j);
					System.out.print(a); 	
				}
				System.out.print(" ");
				t="";	
			}	
		} 
		for(int j=t.length()-1;j>=0;j--)
		{
			char a=t.charAt(j);
			System.out.print(a);	 	
		} 
	}
	public static void main(String[] args)
	{

		 Scanner scan=new Scanner(System.in);
			
			String s=scan.nextLine();

			revers(s);		
	}
}
