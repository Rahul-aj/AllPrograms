package String_ClassRoom;

import java.util.Scanner;

public class India03 
{
	static void  revers3(String s)
	{
		String t="";
		int count=0;
		 	for(int i=0;i<s.length();i++)
		 	{
		 		char ch=s.charAt(i);
		 		
		 		if(ch!=' ')
		 		{
		 			t=t+ch;
		 			count++;
		 		}
		 		else
		 		{
		 			System.out.print(t);
		 			System.out.print(count+" ");
		 			t="";
		 			count=0;
		 		}
		 	}
		 	System.out.print(t);
 			System.out.print(count+" ");
 			t="";
	}

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		
		String s=scan.nextLine();
			
		revers3(s);
	}

}
