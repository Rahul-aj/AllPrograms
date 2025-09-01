package Array_concept;

import java.util.Scanner;

public class A36_print_all_sub_array_whoes_sum_is_k 
{

	static void PrintAllPossibleSubArraywhoesSumisK(int[] ar1,int k)
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
					 if(sum==k)
					 {
						 for (int j = i; j <i+size; j++)
							{
								 System.out.print(ar1[j]+" ");
							} 
						 System.out.println();
					 }
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
		
		int k = scan.nextInt();
		PrintAllPossibleSubArraywhoesSumisK(ar1,k);
	}

}
