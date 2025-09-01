package String_traversal_3;

import java.util.Arrays;
import java.util.Scanner;

public class ST3_01_Sort_string 
{
	  public static void main(String[] args) 
	    {
	        Scanner scan = new Scanner(System.in);
	        String s=scan.nextLine();

	        char[] charArray = s.toCharArray();
	        Arrays.sort(charArray);
	      
	        String sortedString = new String(charArray);
	        
	        System.out.println(sortedString);
	        
	    }
}
