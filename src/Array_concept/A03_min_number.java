package Array_concept;

import java.util.Scanner;

public class A03_min_number 
{
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

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Size of array");
		int n = scan.nextInt();
		
		System.out.println("elements of array");
		int[] ar= new int[n];
		for (int i = 0; i < ar.length; i++) 
		{
			ar[i]=scan.nextInt();
		}
		
		int result =minNumber(ar);
		System.out.println(result);

	}

}
