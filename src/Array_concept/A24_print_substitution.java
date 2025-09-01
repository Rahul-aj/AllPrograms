package Array_concept;

import java.util.Scanner;

public class A24_print_substitution 
{

	static void printPairsubstitutionChecS(int[] ar,int k)
	{
		for (int i = 0; i < ar.length-1; i++) 
		{
			for (int j = i+1; j < ar.length; j++) 
			{
				if(ar[i]-ar[j]==k  ||  ar[j]-ar[i]==k)
				{
					System.out.println(ar[i]+" "+ar[j]);
				}
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
		System.out.println("enter k value");
		int k=scan.nextInt();
		
			printPairsubstitutionChecS(ar,k);
	}

}
