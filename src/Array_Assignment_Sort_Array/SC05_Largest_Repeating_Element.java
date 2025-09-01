package Array_Assignment_Sort_Array;

import java.util.Scanner;

public class SC05_Largest_Repeating_Element 
{ 
	 static int Largest_Repeating_Element(int[] ar)
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

       int res= Largest_Repeating_Element(ar);
       System.out.println(res);
    }
}
