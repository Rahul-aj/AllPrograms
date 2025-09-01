package String_traversal_3;

import java.util.Scanner;

public class ST3_16_Palindromic_Substrings_of_Length_4 
{
	 static void  longhest_palindrom(String s)
	 {
        int size=4;
		for(int i=0;i<=s.length()-size;i++)
		{
			String t="";
			for(int j=i;j<i+size;j++)
			{
				t=t+s.charAt(j);
			 }
				 
			if(ispalindrom(t))
			{
			    System.out.println(t);
				  
			}
		 }
	 }

  static boolean ispalindrom(String s)
  {
	  int i=0,j=s.length()-1;
	  
	 while(i<j)
	 {
		 if(s.charAt(i)==s.charAt(j))
		  {
			i++;
			j--;
		  }
		 else
		 {
			 return false;
		 }
	 }
	 return true;
	  
  }
	 
	 
	public static void main(String[] args) 
	{

		 Scanner scan = new Scanner(System.in);
	      
	       String s=scan.nextLine();
	      
		  longhest_palindrom(s);
		 
	}
}
