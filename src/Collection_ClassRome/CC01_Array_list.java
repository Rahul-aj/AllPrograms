package Collection_ClassRome;

import java.util.ArrayList;
import java.util.Scanner;

public class CC01_Array_list {

	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		
		 ArrayList list = new ArrayList();
		 
		 list.add(scan.next());
		 list.add(scan.nextInt());
		 list.add(scan.next());
		 list.add(scan.next());
		 list.add(scan.next());
		 
		 
		 System.out.println(list);

	}

}
