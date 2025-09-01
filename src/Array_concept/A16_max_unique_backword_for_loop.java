package Array_concept;

import java.util.Scanner;

public class A16_max_unique_backword_for_loop 
{
	 static void MaxUnique(int[] ar) 
		{
			int count=1;
			for (int i = ar.length-2; i>=0; i--) 
			{
				if(ar[i]==ar[i+1])
				{
					count++;
				}
				else if(count==1)
				{
					System.out.println( ar[i]); 
					return;	
				}
				count=1;
			}
			if(count==1)
			{
				System.out.print( ar[ar.length-1]);
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
		
		MaxUnique(ar);
	}

}
