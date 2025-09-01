package Array_Assignment_Sort_Array;

import java.util.Scanner;

public class SC07_Count_Occurrences_of_the_Smallest_Element_in_a_Sorted_Array 
{
	static void   Count_Occurrences_of_the_Smallest_Element_in_a_Sorted_Array(int []ar)
    {
        int count=1;
        int smallElement=ar[0];
       for(int i=1;i<ar.length;i++)
       {
           if(ar[i]==smallElement)
           {
               count++;
           }
           else
           { 
               break;
           }
       }
       System.out.println(count);   
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

      Count_Occurrences_of_the_Smallest_Element_in_a_Sorted_Array(ar);  
   }
}
