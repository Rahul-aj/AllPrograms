package Array_Assignment_Sub_array;

import java.util.Scanner;

public class SUB04_Longest_Subarray_with_Sum_Equal_to_K 
{
	static void  Longest_Subarray_with_Sum_Equal_to_K(int []ar1 ,int k)
    {
        for(int size=ar1.length-1;size>=0;size--)
        {
            for (int i = 0; i <=ar1.length-size; i++)
			{
	            int sum=0;
				for (int j = i; j <i+size; j++)
				{ 
	                 sum=sum+ar1[j];
				}
                if(sum==k)
                {
                    for (int j = i; j <i+size; j++)
				    { 
	                  System.out.print(ar1[j]+" ");
                      
				    }	
                    System.out.println();
                    return;
                }
			}
        }
    }
    public static void main(String[] args)
    {
         Scanner scan = new Scanner(System.in);
	        int k= scan.nextInt();
	       int n1 = scan.nextInt();
	       
			int[] ar1=new int[n1];
			for (int i = 0; i < ar1.length; i++) 
			{
				ar1[i]=scan.nextInt();
			}
	        
	     Longest_Subarray_with_Sum_Equal_to_K(ar1 ,k);     
    }
}
