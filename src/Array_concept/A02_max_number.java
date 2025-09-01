package Array_concept;

import java.util.Scanner;

public class A02_max_number 
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
		
		int result =maxNumber(ar);
		System.out.println(result);
	}

}
