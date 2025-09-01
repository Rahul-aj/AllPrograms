package String_traversal_2;

import java.util.Scanner;

public class ST2_22_Remove_Alphanumeric 
{
	  static String  Remove_Alphanumeric(String s)
	    {
	      String t="";
	      for(int i=0;i<s.length();i++)
	      {
	          char ch=s.charAt(i);
	          if (  !( (ch>='0' && ch<='9') || (ch>='a' && ch<='z') || (ch>='A' && ch<='Z') ) )
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

	     String res=  Remove_Alphanumeric(s);
	     System.out.println(res);
	     
	  }
}
