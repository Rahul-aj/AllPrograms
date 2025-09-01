package String_traversal_2;

import java.util.Scanner;

public class ST2_21_Remove_Uppercase_Characters 
{
	 static String  Remove_Uppercase_Characters(String s)
	    {
	      String t="";
	      for(int i=0;i<s.length();i++)
	      {
	          char ch=s.charAt(i);
	          if (    ! (ch>='A' && ch<='Z')    )
	          {
	              t=t+ch;
	          }
	          
	      }
	      return t;
	    }
	  public static void main(String[] args) 
	  {
	      Scanner scan = new Scanner(System.in);
	      String s = scan.nextLine();

	     String res= Remove_Uppercase_Characters(s);
	     System.out.println(res);
	     
	  } 
}
