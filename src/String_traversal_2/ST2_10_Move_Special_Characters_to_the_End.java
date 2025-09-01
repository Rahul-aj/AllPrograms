package String_traversal_2;

import java.util.Scanner;

public class ST2_10_Move_Special_Characters_to_the_End 
{
	 static String  Move_Special_Characters_to_the_End(String s)
	    {
	        String t1="";
	        for(int i=0;i<s.length();i++)
	        {
	            char ch=s.charAt(i);
	            if( !( (ch==' ')  || (ch>='a' && ch<='z') || ( ch>='A' && ch<='Z') || (ch>='0' && ch<='9') ))
	            {
	                t1=t1+ch;
	            }
	        }

	        String t2="";
	        for(int i=0;i<s.length();i++)
	        {
	            char ch=s.charAt(i);
	             if( (ch==' ')  || (ch>='a' && ch<='z') || ( ch>='A' && ch<='Z') || (ch>='0' && ch<='9') )
	            {
	                t2=t2+ch;
	            }
	        }

	        return t2+t1;
	    }

	    public static void main(String[] args)
	    { 
	        Scanner scan=new Scanner(System.in); 
			String s=scan.nextLine();

	       String res= Move_Special_Characters_to_the_End(s);
	       System.out.println(res);
	    } 
}
