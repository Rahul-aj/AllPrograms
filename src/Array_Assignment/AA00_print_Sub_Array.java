package Array_Assignment;

import java.util.Scanner;

public class AA00_print_Sub_Array 
{
	static void  printSubArray(int[] ar1)
    {
         
        for(int i=0;i<ar1.length-1;i++)
        {
            for(int j=i+1;j<ar1.length;j++)
            {
                  
                 System.out.println(ar1[i]+" "+ar1[j]);
            }
        }
       
    }

	public static void main(String[] args) 
	{
		 Scanner  scan = new Scanner(System.in);
			
			int n = scan.nextInt();
			
			int[] ar1=new int[n];
		
			for (int i = 0; i < ar1.length; i++) 
			{
				ar1[i]=scan.nextInt();
			}
	         printSubArray(ar1);
	}

}
