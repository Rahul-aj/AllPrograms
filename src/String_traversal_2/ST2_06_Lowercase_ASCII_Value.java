package String_traversal_2;

import java.util.Scanner;

public class ST2_06_Lowercase_ASCII_Value 
{
	public static void main(String[] args)
    {
         Scanner  scan = new Scanner(System.in);
		 
		 int a=scan.nextInt();

         if(a>=97  &&  a<= 122)
         {
            System.out.println("Yes");
         }
         else
         {
            System.out.println("No");
         }


    }
}
