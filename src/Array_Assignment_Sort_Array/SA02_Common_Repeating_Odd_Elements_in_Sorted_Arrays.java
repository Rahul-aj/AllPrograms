package Array_Assignment_Sort_Array;

import java.util.Scanner;

public class SA02_Common_Repeating_Odd_Elements_in_Sorted_Arrays 
{

	static void Common_Repeating_Odd_Elements_in_Sorted_Arrays(int[] ar1, int []ar2)
    { 
        int i=0;
        int j=0;
        boolean found= false;
        while(i<ar1.length && j<ar2.length)
        {
            if(ar1[i]==ar2[j])
            {
                if(ar1[i]%2!=0)
                {
                     System.out.print(ar1[i]+" ");
                     found=true;
                }
                i++;
                j++;
            }
            else if(ar1[i]>ar2[j])
            {
                j++;
            }
            else
            {
                i++;
            }
        }
        
        if(!found)
        {
        	System.out.println("No common odd elements found.");
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

	            Common_Repeating_Odd_Elements_in_Sorted_Arrays(ar1,ar2);

	    }
}
