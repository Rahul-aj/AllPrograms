package Collection_ClassRome;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

class myclass1 implements  Comparator<Customer>
{

	@Override
	public int compare(Customer c1, Customer c2) {
		
		String name1=c1.getName();
		String name2= c2.getName();
		
		return name1.compareTo(name2);
	}
	
}

class myclass2 implements  Comparator<Customer>
{

	@Override
	public int compare(Customer c1, Customer c2) {
		
		String name1=c1.getName();
		String name2= c2.getName();
		
		return  name1.length()-name2.length();
	}
	
}




public class CC04_set
{

	public static void main(String[] args)
	{
		// set--- dublicates are not allowed
		
		// order is not maintained
//		 HashSet<Customer> set = new HashSet<Customer>();
		 
		 // insertion order is maintained
//		 LinkedHashSet<Customer> set = new LinkedHashSet<Customer>();
		 
		// sorting using custom sorting
		myclass1 my1 = new myclass1();
		
		// based on length 
//		myclass2 my2 = new myclass2();
	
		
		// sorting 
		 TreeSet<Customer> set = new TreeSet<Customer>(my1);
		 
		 
		 set.add(new Customer(5,"rahul","rahul@gmail.com"));
		 set.add(new Customer(1,"naveen","naveen@gmail.com"));
		 set.add(new Customer(2,"mani","mani@gmail.com"));
		 set.add(new Customer(6,"nayana","nayana@gmail.com"));
		 set.add(new Customer(4,"choota","chootabheem@gmail.com"));
		 set.add(new Customer(3,"choota","choota@gmail.com"));
		 
		 
		 
		 
         // to take input from user
//		 Scanner scan=new Scanner(System.in);
//			
//			System.out.println("enter n");
//			int n = scan.nextInt();
//			
//			Customer[] ar=new Customer[n];
//			
//			for(int i=0;i<n;i++)
//			{
//
//				System.out.println("enter id");
//				int id = scan.nextInt();
//				System.out.println("enter name");
//				String name = scan.next();
//				System.out.println("enter email");
//				String email = scan.next();
//				
//				set.add( new Customer(id,name,email));
//				 
//			}
		 
		 
		 for(Customer x : set)
		 {
			 System.out.println(x);
		 }
			 
		
	}

}
