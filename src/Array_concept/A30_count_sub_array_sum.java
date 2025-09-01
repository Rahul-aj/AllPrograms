package Array_concept;

import java.util.Scanner;

public class A30_count_sub_array_sum 
{
	 static void countsumOfSubArray(int[] ar1, int size,int k) 
	{
		 
		 int count=0;
		 for (int i = 0; i <=ar1.length-size; i++) 
			{
			 int sum=0;
				for (int j = i; j < i+size; j++) 
				{
					sum=sum+ar1[j];		
				}
				if(sum==k)
				{
					count++;
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
			
		int size = scan.nextInt();
		int k = scan.nextInt();
		
		countsumOfSubArray(ar1,size,k);
	}

	

}
