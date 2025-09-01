package String_traversal_2;

import java.util.Scanner;

public class ST2_12_Insert_Asterisks_Before_a_A 
{
	static String Insert_Asterisks_Before_a_A(String s)
    {
       String t="";
       for(int i=0;i<s.length();i++)
       {
           char ch=s.charAt(i);
           if(ch=='a' || ch=='A')
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

     String res=  Insert_Asterisks_Before_a_A(s);
     System.out.println(res);
      
   } 
}
