package Array_concept;

import java.util.Scanner;

public class A32_printAllSubArray 
{
	static void subArray(int[] ar1)
	{
		for (int size = 0; size <=ar1.length; size++) 
		{
			for (int i = 0; i <=ar1.length-size; i++) 
			{
				for (int j = i; j < i+size; j++) 
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
			
		
		subArray(ar1);
	}

	

}
