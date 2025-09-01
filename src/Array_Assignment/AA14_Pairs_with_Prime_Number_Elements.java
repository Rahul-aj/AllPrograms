package Array_Assignment;

import java.util.Scanner;

public class AA14_Pairs_with_Prime_Number_Elements 
{
	static void Pairs_with_Prime_Number_Elements(int[] ar1)
    {
        
        for(int i=0;i<ar1.length-1;i++)
        {
            for(int j=i+1;j<ar1.length;j++)
            {
                if(  isprime(ar1[i])  || isprime(ar1[j])  )
                {
                     System.out.println(ar1[i]+" "+ar1[j]);
                }
            }
        }
        
    }

     static boolean isprime(int n)
    {
        if (n <= 1)
        {
            return false;
        }
        for(int i=2;i<=n/2; i++)
        {
            if(n%i==0)
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

       Pairs_with_Prime_Number_Elements(ar1);
        
    }
}
