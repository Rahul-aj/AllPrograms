package String_traversal_3;

import java.util.Scanner;

public class ST3_07_Trim_Whitespaces 
{
	static String  Trim_Whitespaces(String s)
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

          String res = Trim_Whitespaces(s);
          System.out.println(res);    
	   } 
}
