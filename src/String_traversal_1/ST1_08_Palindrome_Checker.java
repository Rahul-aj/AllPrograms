package String_traversal_1;

import java.util.Scanner;

public class ST1_08_Palindrome_Checker 
{
	static boolean is_palindrome(String s)
    {
       int i=0,j=s.length()-1;
       while(i<j)
       {
           if(s.charAt(i)!=s.charAt(j))
           {
                return false;
           }
           i++;
           j--;
       }
       return true;
    }

   public static void main(String[] args) 
   {
       Scanner scan = new Scanner(System.in);
       String s= scan.nextLine();

       if(is_palindrome(s))
       {
           System.out.println("Yes");
       }
       else
       {
           System.out.println("No");
       }   
   }
}
