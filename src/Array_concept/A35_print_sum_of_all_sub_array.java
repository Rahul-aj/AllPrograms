package Array_concept;

import java.util.Scanner;

public class A35_print_sum_of_all_sub_array 
{

	static void PrintSumAllPossibleSubArray(int[] ar1)
	{
		 
			for (int size = 1; size <= ar1.length; size++) 
			{
				for (int i = 0; i <=ar1.length-size; i++)
				{
					int sum=0;
					for (int j = i; j <i+size; j++)
					{
						 sum=sum+ar1[j];
					}
					System.out.println(sum);
				}
			}
			
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
		 PrintSumAllPossibleSubArray(ar1);
	}

}
