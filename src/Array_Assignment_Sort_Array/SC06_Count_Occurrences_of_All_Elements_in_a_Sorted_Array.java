package Array_Assignment_Sort_Array;

import java.util.Scanner;

public class SC06_Count_Occurrences_of_All_Elements_in_a_Sorted_Array 
{
	static void  Count_Occurrences_of_All_Elements_in_a_Sorted_Array(int []ar)
    {
        int count=1;
       for(int i=0;i<ar.length-1;i++)
       {
           if(ar[i]==ar[i+1])
           {
               count++;
           }
           else
           {
               System.out.println(ar[i]+" "+count);
               count=1;
           }
       }
       System.out.println(ar[ar.length-1]+" "+count);
    }

   public static void main(String[] args)
   {
       Scanner scan = new Scanner(System.in);
       int n = scan.nextInt();
       int[] ar=new int[n];
       for(int i=0;i<ar.length;i++)
       {
           ar[i]=scan.nextInt();
       }

       Count_Occurrences_of_All_Elements_in_a_Sorted_Array(ar);
       
       
   }
}
