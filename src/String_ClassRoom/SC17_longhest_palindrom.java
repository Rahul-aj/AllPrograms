package String_ClassRoom;

import java.util.Scanner;

public class SC17_longhest_palindrom 
{
	static void  longhest_palindrom(String s)
	 {
		 for(int size=s.length();size>0;size--) 
		 {
			 for(int i=0;i<=s.length()-size;i++)
			 {
				 String t="";
				 for(int j=i;j<i+size;j++)
				 {
					 t=t+s.charAt(j);
				 }
				 
				 if(ispalindrom(t))
				 {
					 System.out.println(t);
					 return;
				 }
			 }
		 }
	 }
  static boolean ispalindrom(String s)
  {
	  int i=0,j=s.length()-1;
	  
	 while(i<j)
	 {
		 if(s.charAt(i)==s.charAt(j))
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

		 Scanner scan = new Scanner(System.in);
	       System.out.println("Enter a String: ");
	       String s=scan.nextLine();
	       
	     
			 
		  longhest_palindrom(s);
		 
	}

}
