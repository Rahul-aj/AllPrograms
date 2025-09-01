package Array_concept;

import java.util.Scanner;

public class A09_pair_value_max_product 
{
	
	static int PairValueMaxProduct(int[] ar)
	{
		int p=1 ,vp=1;
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
		int max_product=p*vp;
		return max_product;
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
		
		 int  result =PairValueMaxProduct(ar);
		 System.out.println("pair vaalue max  product is:");
		 System.out.println(result );
	}

	

}
