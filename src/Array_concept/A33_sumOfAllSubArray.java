package Array_concept;

import java.util.Scanner;

public class A33_sumOfAllSubArray 
{
	
	static void sumofsubArray(int[] ar1)
	{
		for (int size = 1; size <=ar1.length; size++) 
		{
			for (int i = 0; i <=ar1.length-size; i++) 
			{
				int sum=0;
				for (int j = i; j < i+size; j++) 
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
			
		
		sumofsubArray(ar1);
	}

}
