package Array_concept;

import java.util.Scanner;

public class A06_second_min_number 
{

	static int SecondMinNumber(int[] ar) 
	{
		int p=Integer.MAX_VALUE,vp=Integer.MAX_VALUE;
		for (int i = 0; i < ar.length; i++) 
		{
			if ( ar[i]<p)
			{
				vp = p;
				p = ar[i];
			} 
			else if(ar[i]<vp)
			{
				vp = ar[i];
			}
		}
		return vp;
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
		
		 int  result =SecondMinNumber(ar);
		 System.out.println("Second min number is:");
		 System.out.println(result );
		
		
	
	}


}
