package Array_Assignment_Sort_Array;

import java.util.Scanner;

public class SC10_Smallest_Repeating_Element_Descending_Order 
{
	 static int Smallest_Repeating_Element_Descending_Order(int[] ar)
	    {
	        for(int i=ar.length-2;i>=0;i--)
	        {
	            if(ar[i]==ar[i+1])
	            {
	                 return ar[i];
	            }
	        } 
	        return -1;    
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
	      

	      int res= Smallest_Repeating_Element_Descending_Order(ar);
	      System.out.println(res);
	    } 
}
