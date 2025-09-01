package Array_Assignment_Sub_array;

import java.util.Scanner;

public class SUB01_All_Possible_Subarrays
{
	static void  All_Possible_Subarrays(int []ar1)
    {
      for (int i = 0; i < ar1.length; i++) 
      {
          for (int j = i; j < ar1.length; j++) 
          {
              for (int k = i; k <= j; k++) 
              {
                  System.out.print(ar1[k] + " ");
              }
              System.out.println();
          }
      }
   }
    
  public static void main(String[] args) 
  {
      Scanner scan = new Scanner(System.in);
      int n1 = scan.nextInt();
		int[] ar1=new int[n1];
		for (int i = 0; i < ar1.length; i++) 
		{
			ar1[i]=scan.nextInt();
		}
      All_Possible_Subarrays(ar1);

  }
}
