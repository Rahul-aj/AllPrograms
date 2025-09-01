package Array_concept;

import java.util.Scanner;

public class A12_n_1_product 
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


	 static int product(int[] ar)
	{
		int p=1;
		for (int i = 0; i < ar.length; i++) 
		{
			p=p*ar[i];	
		}
		return p;
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
		int product_result= product(ar);
		
		System.out.println("maximum value:"+max_result);
		System.out.println("maximum value"+min_result);
		int max_product=product_result/min_result ;
		int min_product=product_result/max_result ;
		
		System.out.println("maximum sum:"+max_product);
		System.out.println("manimum sum:"+min_product);
		
	}

}
