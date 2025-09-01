package Collection_TAI;

import java.util.HashSet;
import java.util.Scanner;

public class C03_remove_duplicates 
{
	private static void removeDuplicates(int[] ar)
	{
		HashSet<Integer> set = new HashSet();
		
		for (int i = 0; i < ar.length; i++) 
		{
			set.add(ar[i]);
		}
		
		for(Integer x:set)
		{
			System.out.println(x);
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
		
		removeDuplicates(ar);
		 
	}

	

}
