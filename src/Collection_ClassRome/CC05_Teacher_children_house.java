package Collection_ClassRome;

import java.util.HashSet;
import java.util.Scanner;

public class CC05_Teacher_children_house 
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		
		HashSet<Double> set = new HashSet<Double>();
		System.out.println("enter how much students u have to add");
		int num = scan.nextInt();
		
		System.out.println("add student house coordinates");
		for(int i=0;i<num;i++)
		{
			int xi = scan.nextInt();
			int yi = scan.nextInt();
			
			 
//			set.add((double)(yi/xi));
			
			if(yi==xi)
			{
				set.add(1.0 );
			}
			else
			{
				set.add((double)(yi/xi));
			}
			
		}
		
		System.out.println("add teacher house coordinates");
		int x0 = scan.nextInt();
		int y0 = scan.nextInt();
		
		if (y0==x0)
		{
			set.add(1.0);
		}
		else
		{
			set.add((double)(y0/x0));
		}
		
		
		
		 System.out.println(set);
		
		System.out.println(set.size());
		
	}

}
