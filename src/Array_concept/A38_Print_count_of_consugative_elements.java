package Array_concept;

import java.util.Scanner;

public class A38_Print_count_of_consugative_elements 
{

	private static void Print_Count_consugative_elements_in_one_line(int[] ar1)
	{
		int count=1;
		for (int i = 0; i < ar1.length-1; i++) 
		{
			if(ar1[i]+1==ar1[i+1])
			{
				//System.out.print(ar1[i]+" ");
				count++;
			}
			else
			{
				System.out.println(count);
				count=1;
			}
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
		
		Print_Count_consugative_elements_in_one_line(ar1);
		
		
	}

}
