package String_traversal_2;

import java.util.Scanner;

public class ST2_07_Lowercase_Character_Count 
{
	 static void Lowercase_Character_Count(String s)
		{
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				char ch=s.charAt(i);
				if( (ch>='a'  && ch<='z') )
				{
					 count++;
				}
			}
			
			System.out.println(count);
		}

		public static void main(String[] args) 
		{
			Scanner scan=new Scanner(System.in); 
			 String s=scan.nextLine();
			 
			 Lowercase_Character_Count(s);
		}
}
