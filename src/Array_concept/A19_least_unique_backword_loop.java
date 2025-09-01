package Array_concept;

import java.util.Scanner;

public class A19_least_unique_backword_loop 
{
	private static void leastUnique(int[] ar)
	{
		int count=1;
		for (int i =ar.length-1; i >=0; i--) 
		{
			if(ar[i]==ar[i-1])
			{
				 count++;
			}
			else
			{
				if(count==1)
				{
					System.out.print(ar[i-1]);
					
				}
				count=1;
			} 
		}
		if(count==1)
		{
			System.out.print(ar[ar.length]);
		} 
		
	}

	public static void main(String[] args)
	{
		Scanner  scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int[] ar=new int[n];
		
		for (int i = 0; i < ar.length; i++) 
		{
			ar[i]=scan.nextInt();
		}
		
		leastUnique(ar);

	}

}
