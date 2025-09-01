package String_traversal_1;

import java.util.Scanner;

public class ST1_10_Number_Printer
{
	 static void   Number_Printer(String s)
	    {
	        boolean found=false;
	        for(int i=0;i<s.length();i++)
	        {
	            char ch=s.charAt(i);
	            if(   ch>='0' && ch<='9'  )
	            {
	                System.out.print(ch+" ");
	                found=true;
	            } 
	        }
	        if(found==false)
	        {
	            System.out.println("No numbers found.");
	        }
	    }
	    public static void main(String[] args) 
	    {
	        Scanner scan = new Scanner(System.in);
	        String s= scan.nextLine();

	      Number_Printer(s);
	    }
}
