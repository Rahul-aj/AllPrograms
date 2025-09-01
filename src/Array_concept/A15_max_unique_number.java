package Array_concept;

import java.util.Scanner;

public class A15_max_unique_number 
{
	
	static void Max_unique(int[] ar)
		{
			int count=1;
			int max=0;
			for (int i = 0; i < ar.length-1; i++) 
			{
				if(ar[i]==ar[i+1])
				{
					count++;
				}
				else
				{
					if(count==1)
					{
						 if(max<ar[i])
						 {
							 max=ar[i];
						 }		 
					}
					count=1;
				}
			}
			System.out.print(max);
			 
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
		
		Max_unique(ar);
	}

	  

}
