package Collection_ClassRome;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class CC03_commane_lelements {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		
//		ArrayList<Integer> list1 = new ArrayList();
//		ArrayList<Integer>  list2 = new ArrayList();
	
		HashSet<Integer> list1 = new HashSet();
		HashSet<Integer> list2 = new HashSet();
		
		
		// for list 1
		System.out.println("enter element to inset into list 1");
		
		int num;
		while((num=scan.nextInt())!= -1)
		{
			list1.add(num);
		}
		
		// for list 2
		System.out.println("enter element to inset into list 2:");
		
		int num2;
		while((num2=scan.nextInt())!= -1)
		{
			list2.add(num2);
		}
		
//		ArrayList<Integer>  ans = new ArrayList();
		HashSet<Integer> ans = new HashSet();
		
		for(Integer x:list1)
		{
			if( list2.contains(x) )
			{
				ans.add(x);
			}
		}
		
		for(Integer y:ans)
		{
			System.out.println(y+" ");
		}
		
		
	}

}
