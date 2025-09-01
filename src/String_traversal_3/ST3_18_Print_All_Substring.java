package String_traversal_3;

import java.util.Scanner;

public class ST3_18_Print_All_Substring
{

    static void  Print_All_Substrings(String s)
	 {
    //   for(int size=1;size<=s.length();size++)
    for(int size=s.length();size>=1;size--)
       {
           for(int i=0;i<=s.length()-size;i++)
		{
			String t="";
			for(int j=i;j<i+size;j++)
			{
				t=t+s.charAt(j);
			 }
			 System.out.println(t);
			 return;
		 }
       }
	 }
	public static void main(String[] args) 
	{

		 Scanner scan = new Scanner(System.in);
	      
	       String s=scan.nextLine();
	      
		 Print_All_Substrings(s);
		 
	}
}
