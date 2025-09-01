package String_ClassRoom;

import java.util.Scanner;

public class India02
{
	static void  revers(String s)
	{
		String t="";
		for(int i=s.length()-1;i>=0;i--)
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
