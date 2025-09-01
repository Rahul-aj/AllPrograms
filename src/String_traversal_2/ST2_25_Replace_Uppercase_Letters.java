package String_traversal_2;

import java.util.Scanner;

public class ST2_25_Replace_Uppercase_Letters
{
	static String Replace_Uppercase_Letters(String s)
    {
        String t="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch>='A' && ch<='Z')
            {
                t=t+"#";
            }
            else
            {
                t=t+ch;
            }
        }
        return t;
    }
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        String s=scan.nextLine();

       String res= Replace_Uppercase_Letters(s);
       System.out.println(res);
    }
}
