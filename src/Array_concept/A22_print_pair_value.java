package Array_concept;

import java.util.Scanner;

public class A22_print_pair_value 
{
	static void printPairValue(int[] ar)
	{
		for (int i = 0; i < ar.length-1; i++) 
		{
			for (int j = i+1; j < ar.length; j++) 
			{
				System.out.println(ar[i]+" "+ar[j]);
			}
		}
	}

	
	public static void main(String[] args) 
	{
		Scanner  scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int[] ar=new int[n];
		
		for (int i = 0; i < ar.length; i++) 
		{
			ar[i]=scan.nextInt();
		}
		
			printPairValue(ar);
	}

	

}
