package String_traversal_1;

import java.util.Scanner;

public class ST1_12_Alphanumeric_Character_Count 
{

    static int  Alphanumeric_Character_Count(String s)
    {
       int count=0;
       for(int i=0;i<s.length();i++)
	    {
	        char ch=s.charAt(i);
	        if(  (ch>='A' && ch<='Z') || (ch>='a' && ch<='z')   || (ch>='0' && ch<='9')  )
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

	     int res=Alphanumeric_Character_Count(s);
        System.out.println(res);        
      
   }
}


