package Array_Assignment;

import java.util.Scanner;

public class AA01_MinimumSumPair 
{
	 static void MinimumPairSum(int[] ar1)
	    {
	        int min=Integer.MAX_VALUE;
	        for(int i=0;i<ar1.length-1;i++)
	        {
	            for(int j=i+1;j<ar1.length;j++)
	            {
	                if(min > ar1[i]+ar1[j])
	                {
	                     min =ar1[i]+ar1[j];
	                }
	            }
	        }
	        System.out.println(min);
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
        MinimumPairSum(ar1);
	}

}
