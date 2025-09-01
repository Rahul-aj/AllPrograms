package Array_Assignment;

import java.util.Scanner;

public class AA15_Pairs_with_Sum_as_Prime_Number 
{

static void  Pairs_with_Sum_as_Prime_Number(int[] ar1)
    { 
        for(int i=0;i<ar1.length-1;i++)
        {
            for(int j=i+1;j<ar1.length;j++)
            {
                 int  sum=ar1[i]+ar1[j];
                 if( isSumprime(sum))
                 {
                    System.out.println(ar1[i]+" "+ar1[j]);
                 }
               
            }
        }   
    }

     static boolean isSumprime(int sum)
    {
        if (sum<= 1)
        {
            return false;
        }
        for(int i=2;i<=sum/2; i++)
        {
            if(sum%i==0)
            {
                return false;
            }
        }
        return true;
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

       Pairs_with_Sum_as_Prime_Number(ar1);
        
    }
}
