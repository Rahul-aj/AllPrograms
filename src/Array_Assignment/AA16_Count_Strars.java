package Array_Assignment;

import java.util.Scanner;

public class AA16_Count_Strars 
{
	
	static void Count_stars(int n)
	{
		int count=0;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				count++;
			}
			
		}
		System.out.println(count);
	}

	public static void main(String[] args) 
	{
		  Scanner  scan = new Scanner(System.in);
			
			int n = scan.nextInt();
			
			
			Count_stars(n);
	}
	
	

}
