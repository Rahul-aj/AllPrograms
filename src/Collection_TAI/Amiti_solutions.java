package Collection_TAI;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Amiti_solutions {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		
		String s=scan.nextLine();
		
		HashMap<Character,Integer> map = new HashMap<>();
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(map.containsKey(ch))
			{
				int count=map.get(ch);
				map.put(ch,count+1 );
			}
			else
			{
				map.put(ch, 1);
				
			}
		}
		
		String t="";
		
		Set<Character> keys=map.keySet();
		for(char key:keys)
		{
			int value=map.get(key);
			t=t+value+key;
		}
		
		System.out.println(t);
		
	}

}
