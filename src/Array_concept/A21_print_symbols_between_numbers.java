package Array_concept;

import java.util.Scanner;

public class A21_print_symbols_between_numbers 
{
	static void printSymbolsBetweenNumber(int[] ar)
	{
		for (int i = 0; i < ar.length-1; i++)
		{
			if(ar[i]%2!=0 && ar[i+1]%2!=0)
			{
				System.out.print(ar[i]+"*");
			}
			else if(ar[i]%2==0 && ar[i+1]%2==0)
			{
				System.out.print(ar[i]+"#");
			}
			else
			{
				System.out.print(ar[i]+"$");
			}
		}
		System.out.print(ar[ar.length-1]);
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
		
			printSymbolsBetweenNumber(ar);
	}
 

}
