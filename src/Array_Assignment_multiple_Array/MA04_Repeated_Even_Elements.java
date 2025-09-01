package Array_Assignment_multiple_Array;

import java.util.Scanner;

public class MA04_Repeated_Even_Elements 
{
	 static void Repeated_Even_Elements(int[] ar1,int[] ar2)
	    {
	         int i=0;
	        int j=0;
	        while(i<ar1.length && j<ar2.length)
	        {
	            if(ar1[i]==ar2[j])
	            {
	                if(ar1[i]%2==0)
	                {
	                     System.out.print(ar1[i]+" ");
	                     
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

	                Repeated_Even_Elements(ar1,ar2);

	    }
}
