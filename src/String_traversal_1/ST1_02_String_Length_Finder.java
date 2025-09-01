package String_traversal_1;

import java.util.Scanner;

public class ST1_02_String_Length_Finder 
{
	 public static void main(String[] args) 
	    {
	        Scanner scan = new Scanner(System.in);
	        String s = scan.nextLine();
	        int count=0;
	        for(int i=0;i<s.length();i++)
	        {
	            char ch=s.charAt(i);
	            if(ch!=' ' || ch==' ')
	            {
	                count++;
	            }
	        }
	        System.out.println(count);

	        
	    }
}
