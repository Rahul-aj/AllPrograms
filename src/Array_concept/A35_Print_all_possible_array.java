package Array_concept;

import java.util.Scanner;

public class A35_Print_all_possible_array 

{
	static void PrintAllPossibleSubArray(int[] ar1)
	{
		 
			for (int size = 1; size <= ar1.length; size++) 
			{
				for (int i = 0; i <=ar1.length-size; i++)
				{
					for (int j = i; j <i+size; j++)
					{
						System.out.print(ar1[j]+" ");
					}
					System.out.println();
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
		 PrintAllPossibleSubArray(ar1);
		
		 
	}

}
