package Array_Assignment_Sub_array;

import java.util.Scanner;

public class SUB05_smallest_Subarray_with_Sum_Equal_to_K 
{
	static void smallestsubarray(int []ar,int k) {
        boolean found= false;
        for(int size=0;size<ar.length;size++)
        {
            for(int i=0;i<=ar.length-size;i++)
            {
                int sum=0;
                for(int j=i;j<i+size;j++)
                {
                    sum=sum+ar[j];
                }
                if(sum==k)
                {
                    for(int j=i;j<i+size;j++)
                        {
                            System.out.print(ar[j]+" ");
                            found=true;   
                        }
                        return;      
                }
            }
        }
        if(!found)
        {
            System.out.print("No subarray found.");
        }
    }

        public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int k=sc.nextInt();
	        int n=sc.nextInt();

	        int[] ar=new int[n];

	        for(int i=0;i<ar.length;i++)
	        {
	            ar[i]=sc.nextInt();
	        }
	        smallestsubarray(ar,k);
	    } 
}
