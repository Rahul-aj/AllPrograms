package Array_Assignment_Sub_array;

import java.util.Scanner;

public class SUB02_All_Subarrays_of_Size_K 
{
	static void  All_Subarrays_of_Size_K(int[] ar1,int size)
    {
        for (int i = 0; i <=ar1.length-size; i++)
			{
				for (int j = i; j <i+size; j++)
				{
					System.out.print(ar1[j]+" ");
				}
				System.out.println();
			}
    }
   public static void main(String[] args) 
   {
       Scanner scan = new Scanner(System.in);
        int size= scan.nextInt();
       int n1 = scan.nextInt();
       
		int[] ar1=new int[n1];
		for (int i = 0; i < ar1.length; i++) 
		{
			ar1[i]=scan.nextInt();
		}
        
       All_Subarrays_of_Size_K(ar1 ,size);        
   }
}
