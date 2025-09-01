package Array_concept;

import java.util.Scanner;

public class A25_mergeArray
{
	private static int[] mergeArray(int[] ar1, int[] ar2)
	{
		int i=0,j=0,k=0;
		int[] res=new int[ar1.length+ar2.length];
		
		
		//    for(  ; i<ar1.length && j<ar2.length ;  )    or      while(i<ar1.length && j<ar2.length)
		while(i<ar1.length && j<ar2.length)
		{
			if(ar2[j]<ar1[i])
			{
				res[k]=ar2[j];
				k++;
				j++;			
			}
			else
			{
				res[k]=ar1[i];
				k++;
				i++;
			}
		}
		
		// for(;ar1.length;) while(i<ar1.length)
		
		while(i<ar1.length)
		{
			res[k]=ar1[i];
			k++;
			i++;	
		}
		
		while(j<ar2.length)
		{
			res[k]=ar2[j];
			k++;
			j++;
		}
		
		return res;
		
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
		
		for (int j = 0; j < ar2.length; j++) 
		{
			ar2[j]=scan.nextInt();
		}
		
		 int[] result=mergeArray(ar1,ar2);
		 for(int i=0;i<result.length;i++)
		 {
			 System.out.print(result[i]+" ");
		 }
	}

	

}
