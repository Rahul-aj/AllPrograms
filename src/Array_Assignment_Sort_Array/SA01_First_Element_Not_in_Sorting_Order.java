package Array_Assignment_Sort_Array;

import java.util.Scanner;

public class SA01_First_Element_Not_in_Sorting_Order 
{
	 static int Element_Not_in_Sorting_Order (int []ar)
	    {
	        for(int i=0;i<ar.length-1;i++)
	        {
	            if(ar[i]  > ar[i+1])
	            {
	                
	                return ar[i+1];
	            }
	        }
	        	
	       return -1;
	        
			
	    }

 public static void main(String[] args)
  {
    Scanner  scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int[] ar=new int[n];
		for (int i = 0; i < ar.length; i++) 
		{
			ar[i]=scan.nextInt();
		}

     int res=Element_Not_in_Sorting_Order(ar);
     
      System.out.println(res);

 }
}
