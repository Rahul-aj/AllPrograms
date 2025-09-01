package String_ClassRoom;

import java.util.Scanner;

public class SC06_count_consonants {

	static void count_Consonants (String s)
	{
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if((ch>='A' && ch>='Z')  || (ch>='a'  && ch<='z') )
			{
				if(!(ch=='a' || ch=='e' || ch=='i' || ch=='o'  || ch=='u'  
					     ||ch=='A' || ch=='E' || ch=='I' || ch=='O'  || ch=='U'))
						{
						
							count++;
						}
			}
		}
		
		System.out.println("count = "+count);
	}

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);

		 System.out.println("Enter a String: ");
		 String s=scan.next();
		 
		 count_Consonants (s);
	}

}
