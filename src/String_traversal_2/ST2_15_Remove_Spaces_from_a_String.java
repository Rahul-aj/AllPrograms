package String_traversal_2;

import java.util.Scanner;

public class ST2_15_Remove_Spaces_from_a_String 
{
	static String  Remove_Spaces_from_a_String(String s)
    {
        String t="";
        int si=0,ei=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch!=' ')
            {
                si=i;
                break;
            }
        }

         for(int j=s.length()-1;j>=0;j--)
        {
            char ch=s.charAt(j);
            if(ch!=' ')
            {
                ei=j;
                break;
            }
        }

        for(int i=si;i<=ei;i++)
        {
             char ch=s.charAt(i);
             t=t+ch;
        }
        return t;
    }
     public static void main(String[] args)
	    {
	      Scanner scan=new Scanner(System.in);
          String s=scan.nextLine();

          String res = Remove_Spaces_from_a_String(s);
          System.out.println(res);    
	   } 
}
