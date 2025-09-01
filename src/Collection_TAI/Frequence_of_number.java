package Collection_TAI;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Frequence_of_number
{
	private static void findFrequency(int[] ar)
	{
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for (int i = 0; i < ar.length; i++)
		{
			if (map.containsKey(ar[i]) )
			{
				int x = map.get(ar[i]);
				map.put(ar[i], x+1);
			} 
			else
			{
				map.put(ar[i],1);
			}
		}
		
		for (Entry<Integer, Integer> y : map.entrySet()) 
		{
		    Integer key = y.getKey();
		    Integer value = y.getValue();
		    System.out.println(key + "=" + value);
		}	 
			
	}

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int [] ar=new int[n];
		
		for (int i = 0; i < n; i++)
		{
			ar[i]=scan.nextInt();
		}
		
		findFrequency(ar);
	}

	

}
