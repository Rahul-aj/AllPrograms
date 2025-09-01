package Array_concept;

import java.util.Scanner;

public class A27_print_repeated_elements 
{
	
	static void printRepeatedElements(int[] ar1, int[] ar2) 
	{
		int i=0,j=0;
		while(i<ar1.length && j<ar2.length)
		{
			if (ar1[i]==ar2[j])
			{
				System.out.print(ar1[i]+" ");
				i++;
				j++;
			}
			else if(ar2[j]<ar1[i])
			{
				j++;
			}
			else
			{
				i++;
			}
		}
	}

	public static void main(String[] args) 
	{
		Scanner  scan = new Scanner(System.in);
		
		int n1 = scan.nextInt();
		
		int[] ar1=new int[n1];
		
		for (int i = 0; i < ar1.length; i++) 
		{
			ar1[i]=scan.nextInt();
		}
		
		 
		
		int n2 = scan.nextInt();
		
		int[] ar2=new int[n2];
		
		for (int j = 0; j < ar2.length; j++) 
		{
			ar2[j]=scan.nextInt();
		}
		
		printRepeatedElements(ar1,ar2);
		
	}

	

}
