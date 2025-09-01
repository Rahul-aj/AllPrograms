package String_ClassRoom;

import java.util.Scanner;

public class SC01_Palindrom 
{

	  static boolean isPalindrome(String str)
	 {
		 int i=0;
		 int j= str.length()-1;
		 
		 while(i<j)
		 {
			 if(str.charAt(i) == str.charAt(j))
			 {
				 i++;
				 j--;
			 }
			 else
			 {
				  return false;
				
			 }
			
		 }
		  return true;
	 }
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		 
		 System.out.println("Enter a String: ");
		 String str=scan.next();
		 
		 
		 boolean res=isPalindrome(str);
		 System.out.println(res);
		 
		 
	}

}
