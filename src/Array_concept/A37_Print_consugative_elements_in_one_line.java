package Array_concept;

import java.util.Scanner;

public class A37_Print_consugative_elements_in_one_line 
{

	private static void Print_consugative_elements_in_one_line(int[] ar1)
	{
		for (int i = 0; i < ar1.length-1; i++) 
		{
			if(ar1[i]+1==ar1[i+1])
			{
				System.out.print(ar1[i]+" ");
			}
			else
			{
				System.out.println(ar1[i]);
			}
		}
		System.out.println(ar1[ar1.length-1]);
		
	}

	public static void main(String[] args)
	{
		Scanner  scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int[] ar1=new int[n];
		
		for (int i = 0; i < ar1.length; i++) 
		{
			ar1[i]=scan.nextInt();
		}
		
		Print_consugative_elements_in_one_line(ar1);
		
		
	}


}
