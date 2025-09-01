package Array_Assignment_miscellaneous;

import java.util.Scanner;

public class AM01_Rearrange_Array_with_1_at_the_Beginning
{
	 static void Rearrange_Array_with_1_at_the_Beginning(int []ar) {
	        int i=ar.length-1 , j=ar.length-1;

	        while(i>=0)
	        {
	            if(ar[i]==-1){
	                i--;
	            }
	            else 
	            {
	                ar[j--]=ar[i--];
	            }
	        }
	        while(j>=0)
	        {
	            ar[j--]=-1;
	            
	        }
	        for (int k = 0; k < ar.length; k++) {
	            System.out.print(ar[k] + " ");
	        }
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n=sc.nextInt();

	        int []ar=new int[n];
	        for(int i=0;i<ar.length;i++)
	        {
	            ar[i]=sc.nextInt();
	        }
	        Rearrange_Array_with_1_at_the_Beginning(ar);
	    }
}
