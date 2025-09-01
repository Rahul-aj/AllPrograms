package Array_concept;

import java.util.Scanner;

public class A39_max_count_of_consugativ_elements 
{
	private static void Print_max_Count_consugative_elements(int[] ar1)
	{
		int count=1,max=0;
		for (int i = 0; i < ar1.length-1; i++) 
		{
			if(ar1[i]+1==ar1[i+1])
			{
				 
				count++;
			}
			else
			{
				 if(max <count)
				 {
					 max=count;
				 }
				 count=1;
			}
		}
		if(max <count)
		 {
			 max=count;
		 }
		 
		System.out.println(count);
		
	}

	public static void main(String[] args) 
	{
		Scanner  scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int[] ar1=new int[n];
		
		for (int i = 0; i < ar1.length; i++) 
		{
			ar1[i]=scan.nextInt();
		}
		
		Print_max_Count_consugative_elements(ar1);
	}

}
