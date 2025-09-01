package String_traversal_2;

import java.util.Scanner;

public class ST2_05_Uppercase_ASCII_Check 
{
	 public static void main(String[] args)
	    {
	         Scanner  scan = new Scanner(System.in);
			 
			 int a=scan.nextInt();

	         if(a>=65   &&  a<= 90)
	         {
	            System.out.println("Yes");
	         }
	         else
	         {
	            System.out.println("No");
	         }


	    }
}
