package Array_Assignment_multiple_Array;

import java.util.Scanner;

public class MA02_Array_Merger_Three_Arrays
{
	static int[] Array_Merger_Three_Arrays(int[]ar1,int[]ar2,int[] ar3)
    {
        int  k=0;

        int[] res=new int[ar1.length + ar2.length + ar3.length];

      for(int i=0;i<ar1.length;i++)
      {
          res[k]=ar1[i];
          k++;
      }
       for(int j=0;j<ar2.length;j++)
      {
          res[k]=ar2[j];
          k++;
      }
        for(int j=0;j<ar3.length;j++)
      {
          res[k]=ar3[j];
          k++;
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
			for (int i = 0; i < ar2.length; i++) 
			{
				ar2[i]=scan.nextInt();
			}

             int n3 = scan.nextInt();
			int[] ar3=new int[n3];
			for (int i = 0; i < ar3.length; i++) 
			{
				ar3[i]=scan.nextInt();
			}

	            int[] ans=Array_Merger_Three_Arrays(ar1,ar2,ar3);

                System.out.print("Merged array: ");
                for(int i=0;i<ans.length;i++)
                {
                    System.out.print(ans[i]+" ");
                }
    }
}
