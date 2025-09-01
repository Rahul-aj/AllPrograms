package Array_Assignment_Sort_Array;

import java.util.Scanner;

public class SC11_Coun_Unique_Elements
{
	static void  Coun_Unique_Elements(int[] ar)
    {
         int count = 0;
       for (int i = 0; i < ar.length; i++)
       {
           boolean val = true;
           for(int j = i+1; j < ar.length; j++)
           {
               if(ar[i] == ar[j] && ar[i] != -1 )
               {
                   ar[j] = -1;
                   val = false;
               }
           }
           if(val==true && ar[i] != -1)
           {
               count++;
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

          Coun_Unique_Elements(ar);
      
   }
}
