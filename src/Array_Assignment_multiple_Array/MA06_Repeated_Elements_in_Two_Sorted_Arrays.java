package Array_Assignment_multiple_Array;

import java.util.Scanner;

public class MA06_Repeated_Elements_in_Two_Sorted_Arrays 
{
	static void  Repeated_Elements_in_Two_Sorted_Arrays(int[] ar1, int []ar2)
    {
       for(int i=0;i<ar1.length;i++)
       {
           for(int j=0;j<ar2.length;j++)
           {
               if(ar1[i]==ar2[j])
               {
                   System.out.print(ar1[i]+" ");
               }
           }
       }
    }  

   public static void main(String[] args)
   {
        Scanner  scan = new Scanner(System.in);
                int n1 = scan.nextInt();
				int[] ar1=new int[n1];
				for (int i = 0; i < ar1.length; i++) 
				{
					ar1[i]=scan.nextInt();
				}

		        int n2 = scan.nextInt();
				int[] ar2=new int[n2];
				for (int i = 0; i < ar2.length; i++) 
				{
					ar2[i]=scan.nextInt();
				} 

               Repeated_Elements_in_Two_Sorted_Arrays(ar1,ar2);    
   }

}
