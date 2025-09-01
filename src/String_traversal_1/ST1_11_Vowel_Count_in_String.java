package String_traversal_1;

import java.util.Scanner;

public class ST1_11_Vowel_Count_in_String 
{
	static int  Vowel_Count_in_String(String s)
    {
       int count=0;
       for(int i=0;i<s.length();i++)
	    {
	        char ch=s.charAt(i);
	        if(   ch=='a' || ch=='e' || ch=='i' || ch=='o'  || ch=='u'  ||
                 ch=='A' || ch=='E' || ch=='I' || ch=='O'  || ch=='U'     )
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

	     int res=Vowel_Count_in_String(s);
        System.out.println(res);        
      
   }
}
