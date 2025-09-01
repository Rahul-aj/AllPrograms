package Array_Assignment_miscellaneous;

import java.util.Scanner;

public class AM03_Rearrange_Arraywith_Positive_Integers_at_the_Beginning_and_Negative_Integers_at_the_En 
{
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();
	        int[] ar = new int[n];
	        for (int i = 0; i < ar.length; i++) {
	            ar[i] = scanner.nextInt();
	        }
	        int[] rearrangedArray = new int[n];
	        int negativeIndex = 0;
	        for (int i = 0; i < n; i++) {
	            if (ar[i] >=0) {
	                rearrangedArray[negativeIndex++] = ar[i];
	            }
	        }

	    
	        for (int i = 0; i < n; i++) {
	            if (ar[i] < 0) {
	                rearrangedArray[negativeIndex++] = ar[i];
	            }
	        }

	        
	        for (int k = 0; k < n; k++) {
	            System.out.print(rearrangedArray[k]);
	            if (k != n - 1) {
	                System.out.print(" ");
	            }
	        }
	        }
}
