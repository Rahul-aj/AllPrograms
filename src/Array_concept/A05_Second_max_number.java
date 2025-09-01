package Array_concept;

import java.util.Scanner;

public class A05_Second_max_number 
{

	static int SecondMaxElement(int[] ar)
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
		return vp;
		
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
		
		int result = SecondMaxElement(ar);
		
		System.out.println("Second max number is");
		System.out.println(result);
	}

	

}
