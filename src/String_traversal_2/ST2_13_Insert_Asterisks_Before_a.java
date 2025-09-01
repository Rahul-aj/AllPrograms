package String_traversal_2;

import java.util.Scanner;

public class ST2_13_Insert_Asterisks_Before_a 
{
	static String Insert_Asterisks_Before_a(String s)
    {
       String t1="";
       for(int i=0;i<s.length();i++)
       {
           char ch=s.charAt(i);
            if(ch=='a')
            {
                t1=t1+"*"+ch;
            }
            else {
                t1=t1+ch;
            }
       }
       return t1;
    }

   public static void main(String[] args)
    {
       Scanner scan = new Scanner(System.in);
       String s= scan.nextLine();

     String res=  Insert_Asterisks_Before_a(s);
     System.out.println(res);
      
   }  
}
