package Array_concept;

import java.util.Scanner;

public class A11_n_1_sum 
{
	
	static int maxNumber(int [] ar)
	{
		int max=Integer.MIN_VALUE;
		for (int i = 0; i < ar.length; i++) 
		{
			if(ar[i]>max)
			{
				max=ar[i];
			}
		}
		return max;
	}
	
	
	static int minNumber(int [] ar)
	{
		int min=Integer.MAX_VALUE;
		for (int i = 0; i < ar.length; i++) 
		{
			if(ar[i]<min)
			{
				min=ar[i];
			}
		}
		return min;
	}


	 static int sum(int[] ar)
	{
		int sum=0;
		for (int i = 0; i < ar.length; i++) 
		{
			sum=sum+ar[i];	
		}
		return sum;
	}
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		
		int[] ar = new int[n];
		
		for (int i = 0; i < ar.length; i++) 
		{
			ar[i]=scan.nextInt();
		}
		
		int max_result =maxNumber(ar);
		int min_result =minNumber(ar);
		int sum = sum(ar);
		
		int max_total=sum-min_result ;
		int min_total=sum-max_result ;
		
		System.out.println("maximum sum:"+max_total);
		System.out.println("manimum sum:"+min_total);
		
	}



}
