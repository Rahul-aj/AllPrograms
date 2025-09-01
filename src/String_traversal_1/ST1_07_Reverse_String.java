package String_traversal_1;

import java.util.Scanner;

public class ST1_07_Reverse_String 
{
	 public static void main(String[] args)
     {
        Scanner scan = new Scanner(System.in);
        String s= scan.nextLine();

        String t="";
        for(int i=s.length()-1; i>=0;  i--)
        {
            t=t+s.charAt(i);
        }

        System.out.println(t);
       
    }
}
