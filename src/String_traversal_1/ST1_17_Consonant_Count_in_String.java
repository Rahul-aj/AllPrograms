package String_traversal_1;

import java.util.Scanner;

public class ST1_17_Consonant_Count_in_String 
{
	static int  Consonant_Count_in_String(String s)
    {
       int count=0;
       for(int i=0;i<s.length();i++)
	    {
	        char ch=s.charAt(i);
	        if(  (ch>='A' && ch<='Z') || (ch>='a' && ch<='z')  )
            {
                if( ! (   ch=='a' || ch=='e' || ch=='i' || ch=='o'  || ch=='u'  ||
                 ch=='A' || ch=='E' || ch=='I' || ch=='O'  || ch=='U'     ) )
                 {
                    count++;
                 }
	        } 
	    }
       return count;
    }
   public static void main(String[] args) 
   {
       Scanner scan = new Scanner(System.in);
	    String s= scan.nextLine();

	     int res=Consonant_Count_in_String(s);
        System.out.println(res);        
      
   }
}
