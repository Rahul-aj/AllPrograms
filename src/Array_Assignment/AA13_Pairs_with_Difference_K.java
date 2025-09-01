package Array_Assignment;

import java.util.Scanner;

public class AA13_Pairs_with_Difference_K 
{

	static void  Pairs_with_Difference_K(int[] ar1,int k)
    {
        
        for(int i=0;i<ar1.length-1;i++)
        {
            for(int j=i+1;j<ar1.length;j++)
            {
                if( ar1[i]-ar1[j]==k  ||    ar1[j]-ar1[i]==k)
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

       Pairs_with_Difference_K(ar1,k);
}
}
