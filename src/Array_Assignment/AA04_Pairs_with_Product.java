package Array_Assignment;

import java.util.Scanner;

public class AA04_Pairs_with_Product 
{
	static void PairsWithProduct(int[] ar1,int k)
    {
        
        for(int i=0;i<ar1.length-1;i++)
        {
            for(int j=i+1;j<ar1.length;j++)
            {
                if( ar1[i]*ar1[j]==k)
                {
                     System.out.println(ar1[i]+" "+ar1[j]);
                }
            }
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
	        int k = scan.nextInt();

	        PairsWithProduct(ar1,k);
	}

}
