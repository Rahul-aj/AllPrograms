package Collection_TAI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;



 


public class C02_length_of_longest_string   
{
	 

	private static void FindLength(String[] ar)
	{
		ArrayList<Integer> list = new ArrayList();
		
//		TreeSet<Integer> set = new TreeSet();
		
		for (int i = 0; i < ar.length; i++) 
		{
			int x=ar[i].length();
			list.add(x);
		}
		
		int max=Integer.MIN_VALUE;
		for(Integer x:list)
		{
			 if(max<x)
			 {
				 max=x;
			 }
		}
		System.out.println(max);
	}
	
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		
		int n = scan.nextInt();
		
		String [] ar=new String[n];
		
		for (int i = 0; i < n; i++)
		{
			ar[i]=scan.next();
		}
		
		FindLength(ar);
		
		
	 
	}

	

}
