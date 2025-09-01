package Collection_ClassRome;

import java.util.Scanner;
import java.util.TreeSet;

public class C02_Remove_All_DUplicate_String 
{
	static void Remove_All_DUplicate_String(String s)
	{
		String[] ar=s.split(",");
		
		TreeSet<String> tSet = new TreeSet<String>();
		
		for(String str : ar)
		{
			tSet.add(str);
		}
		
		
		for(  String url  :  tSet)
		{
			System.out.println(url);
		}
	}

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		
		Remove_All_DUplicate_String(s);
	}

}
