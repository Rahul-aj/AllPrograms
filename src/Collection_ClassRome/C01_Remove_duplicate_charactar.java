package Collection_ClassRome;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class C01_Remove_duplicate_charactar 
{
	static void Remove_duplicate_charactar(String s)
	{
		
		// LinkedHashSet  set = new LinkedHashSet();
		
		LinkedHashSet<Character>  set = new LinkedHashSet<Character>();
		 
		 for(int i=0;i<s.length();i++)
		 {
			 set.add(s.charAt(i));
		 }
		 
		 String t="";
		 
		 for( char ch  : set )
		 {
			 System.out.print(ch);
		 }
		
	}

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		
		Remove_duplicate_charactar(s);
		
	}

}
