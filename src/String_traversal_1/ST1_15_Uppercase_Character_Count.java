package String_traversal_1;

import java.util.Scanner;

public class ST1_15_Uppercase_Character_Count 
{
	 static int  Uppercase_Character_Count(String s)
	    {
	       int count=0;
	       for(int i=0;i<s.length();i++)
		    {
		        char ch=s.charAt(i);
		        if(  (ch>='A' && ch<='Z') )
	           {
	               count++;
		        } 
		    }
	       return count;
	    }
	   public static void main(String[] args) 
	   {
	       Scanner scan = new Scanner(System.in);
		    String s= scan.nextLine();

		     int res=Uppercase_Character_Count(s);
	        System.out.println(res);        
	      
	   }
}
