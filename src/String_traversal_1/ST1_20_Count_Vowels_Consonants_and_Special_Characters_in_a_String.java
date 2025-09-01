package String_traversal_1;

import java.util.Scanner;

public class ST1_20_Count_Vowels_Consonants_and_Special_Characters_in_a_String 
{
	 static void count_v_c_s(String s)
	    {
	        int vc=0,cc=0,sc=0;
	        for(int i=0;i<s.length();i++)
	        {
	            char ch=s.charAt(i);
	             if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z'))
	             {
	                 if(   ch=='a' || ch=='e' || ch=='i' || ch=='o'  || ch=='u'  ||
	                 ch=='A' || ch=='E' || ch=='I' || ch=='O'  || ch=='U'  )
	                 {
	                    vc++;
	                 }
	                 else
	                 {
	                    cc++;
	                 }
	             }
	              if(ch!=' ')
	              {
	                if(  ! ( (ch>='A' && ch<='Z') 
	                     || (ch>='a' && ch<='z')  
	                     || (ch>='0' && ch<='9') ) )
	                     {
	                         sc++;
	                     }
	              }
	        }

	        System.out.println("Vowels: "+vc);
	        System.out.println("Consonants: "+cc);
	        System.out.println("Special Characters: "+sc);
	    }

	    public static void main(String[] args) 
	   {
	       Scanner scan = new Scanner(System.in);
		    String s= scan.nextLine();

	        count_v_c_s(s);
	   }
}
