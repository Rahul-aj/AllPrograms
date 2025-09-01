package Array_concept;

 
import java.util.Scanner;

public class A08_pair_value_min_sum 
{
	
	static int  pairValueMinSum(int[] ar)
	{
		int p = Integer.MAX_VALUE;
		int vp = Integer.MAX_VALUE;
		
		for (int i = 0; i < ar.length; i++)
		{
			if(ar[i]<p)
			{
				vp=p;
				p=ar[i];
			}
			else if(ar[i]<vp)
			{
				vp =ar[i];
			}
		}
		int min_sum=p + vp;
		return min_sum;			
		
	}
	
	

	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		 int[] ar = new int[n];
		
		for (int i = 0; i < ar.length; i++)
		{
			ar[i] = scan.nextInt();
		}
		
		
		    int  resutl = pairValueMinSum(ar);
		    System.out.println(resutl);
		
		
	}

	

}
