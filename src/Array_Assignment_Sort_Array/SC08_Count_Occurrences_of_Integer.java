package Array_Assignment_Sort_Array;

import java.util.Scanner;

public class SC08_Count_Occurrences_of_Integer 
{
	static int Count_Occurrences_of_Integer(int[] ar,int k)
    {
       int count=0;
       for(int  i=0;i<ar.length;i++)
       {
            if(k==ar[i])
               {
                    count++;
               }
       }
       return count;   
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
        int k= scan.nextInt();

      int res= Count_Occurrences_of_Integer(ar,k);
      System.out.println(res);
   }
}
