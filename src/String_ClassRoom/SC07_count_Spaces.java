package String_ClassRoom;

import java.util.Scanner;

public class SC07_count_Spaces 
{

	 static int count_space(String s)
	 {
		 int count=0;
		 for(int i=0;i<s.length();i++)
		 {
			 if(s.charAt(i)==' ')
			 {
				 count++;
			 }
		 }
		 return count;
	 }
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);

		 System.out.println("Enter a String: ");
		 String s=scan.nextLine();
		 
		 int res=count_space(s);
		 System.out.println(res);
		 
	}

}
