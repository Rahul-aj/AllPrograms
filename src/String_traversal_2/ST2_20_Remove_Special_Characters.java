package String_traversal_2;

import java.util.Scanner;

public class ST2_20_Remove_Special_Characters 
{
	static String  Remove_Special_Characters(String s)
    {
      String t="";
      for(int i=0;i<s.length();i++)
      {
          char ch=s.charAt(i);
          if ( (ch>='0' && ch<='9') || (ch>='a' && ch<='z') || (ch>='A' && ch<='Z') || ch==' '  )
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

     String res= Remove_Special_Characters(s);
     System.out.println(res);
     
  } 
}
