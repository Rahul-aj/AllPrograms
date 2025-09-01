package Array_concept;

import java.util.Scanner;

public class A07_pair_value_max 
{
	 static int PairValueMax(int[] ar) 
	{
		int p=Integer.MIN_VALUE ,vp=Integer.MAX_VALUE;
		for (int i = 0; i < ar.length; i++) 
		{
			if(ar[i]>p)
			{
				vp = p;
				p = ar[i];
			}
			else if(ar[i]>vp)
			{
				vp = ar[i];
			}	
		}
		int sum=p+vp;
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
		
		 int  result =PairValueMax(ar);
		 System.out.println("pair vaalue max is:");
		 System.out.println(result );
	}

	

}
