package Array_concept;

import java.util.Scanner;

public class A20_maximum_occuring_element 
{
	
	private static void maximumOccuringElement(int[] ar) 
	{
		int count=1;
		int max=0;
		int element=0;
		for (int i = 0; i < ar.length-1; i++)
		{
			if(ar[i]==ar[i+1])
			{
				count++;
			}
			else
			{
				if(count>max)
				{
					max=count;
					element=ar[i];	
				}
				count=1;
			}
		}
		if(count>max)
		{
			max=count;
			element=ar[ar.length-1];	
		}
		
		System.out.print(element);
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
		
			maximumOccuringElement(ar);
	}

	

}
