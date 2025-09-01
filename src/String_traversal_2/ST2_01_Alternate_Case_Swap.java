package String_traversal_2;

import java.util.Scanner;

public class ST2_01_Alternate_Case_Swap 
{
	 static void  Alternate_Case_Swap(String s)
     {
        String t="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            {
                if(ch>='A' && ch<='Z')
                {
                    t=t+(char)(ch+32);
                }
                else if(ch>='a' && ch<='z')
                {
                    t=t+(char)(ch-32);
                }
                else
                {
                    t=t+ch;
                }
            }
        }
        System.out.println(t);
     }

     public static void main(String[] args) 
	{
	    Scanner scan = new Scanner(System.in);
		String s= scan.nextLine();   

               Alternate_Case_Swap(s);
	      
	}

}
