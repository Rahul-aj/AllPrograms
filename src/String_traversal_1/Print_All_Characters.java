package String_traversal_1;

import java.util.Scanner;

public class Print_All_Characters 
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String s=scan.nextLine();
	    for(int i=0;i<s.length();i++)
	    {
	      System.out.println(s.charAt(i));
	    }
	 }
}
