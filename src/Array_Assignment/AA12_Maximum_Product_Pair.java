package Array_Assignment;

import java.util.Scanner;

public class AA12_Maximum_Product_Pair 
{
	static void  Maximum_Product_Pairs(int[] ar1)
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<ar1.length-1;i++)
        {
            for(int j=i+1;j<ar1.length;j++)
            {
                if(max< ar1[i]*ar1[j])
                {
                     max=ar1[i]*ar1[j];
                }
            }
        }
        System.out.println(max);
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
          Maximum_Product_Pairs(ar1);
}
}
