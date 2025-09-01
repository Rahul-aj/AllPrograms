package String_ClassRoom;

import java.util.Scanner;

public class SC08_Count_word 
{
	int count=0;
	 static int count_word(String s)
	 {
		 int count=0;
		 for(int i=0;i<s.length();i++)
		 {
			 if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')
			 {
				 count++;
			 }
		 }
		 return s.charAt(0)==' '? count:count+1;
	 }

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);

		 System.out.println("Enter a String: ");
		 String s=scan.nextLine();
		 
		 int res=count_word(s);
		 System.out.println(res);
	}

}
