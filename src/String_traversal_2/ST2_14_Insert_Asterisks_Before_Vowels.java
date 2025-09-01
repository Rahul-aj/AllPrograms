package String_traversal_2;

import java.util.Scanner;

public class ST2_14_Insert_Asterisks_Before_Vowels 
{
	 static String Insert_Asterisks_Before_Vowels(String s)
	    {
	       String t="";
	       for(int i=0;i<s.length();i++)
	       {
	           char ch=s.charAt(i);
	          if(   ch=='a' || ch=='e' || ch=='i' || ch=='o'  || ch=='u'  ||
	                 ch=='A' || ch=='E' || ch=='I' || ch=='O'  || ch=='U'     )
	           {
	               t=t+"*"+ch;
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
	       String s= scan.nextLine();

	     String res=  Insert_Asterisks_Before_Vowels(s);
	     System.out.println(res);
	      
	   } 
}
