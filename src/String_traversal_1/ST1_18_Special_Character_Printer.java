package String_traversal_1;

import java.util.Scanner;

public class ST1_18_Special_Character_Printer 
{
	 static void Special_Character_Printer(String s)
	    {
	        boolean found=false;
	       for(int i=0;i<s.length();i++)
		    {
		        char ch=s.charAt(i);
		        if(ch!=' ')
		        {
		        	if(  ! ( (ch>='A' && ch<='Z') || (ch>='a' && ch<='z')   || (ch>='0' && ch<='9') ) )
		            {
		               System.out.print(ch+" ");
		               found=true;
			        } 
		        }
		    }
	        if(found==false)
	        {
	            System.out.print("No special characters found.");
	        }
	       
	    }
	   public static void main(String[] args) 
	   {
	       Scanner scan = new Scanner(System.in);
		    String s= scan.nextLine();

		      Special_Character_Printer(s);   
	   } 
}
