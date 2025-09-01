package Array_concept;

import java.util.Scanner;

public class A40_longhest_consugative_array 
{
	static void Print_max_Count_consugative_elements(int[]ar1)
	{
		int si=0,ei=0,start=0,end=0;
		for (int i = 0; i < ar1.length-1; i++) 
		{
			if(ar1[i]+1==ar1[i+1])
			{
				ei++;
			}
			else
			{
				if(  ei-si >end-start )
				{
					start=si;
					end=ei;
				}
				si=i+1;
				ei=i+1;
			}		
		}
		if(  ei-si >end-start )
		{
			start=si;
			end=ei;
		}
		
		for(int i=start;i<=end;i++)
		{
			System.out.print(ar1[i]+" ");
		}	
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
		
		Print_max_Count_consugative_elements(ar1);
	}

}
