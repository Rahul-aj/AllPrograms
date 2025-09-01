package Array_Assignment;

import java.util.Scanner;

public class AA07_Counting_Pairs 
{
	 static void  CountingPairs(int[] ar1)
	    {
         int count=0;
	        for(int i=0;i<ar1.length-1;i++)
	        {
	            for(int j=i+1;j<ar1.length;j++)
	            {
	                 count++;
	            }
	        }
         System.out.println(count);
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
	         CountingPairs(ar1);
	}

}
