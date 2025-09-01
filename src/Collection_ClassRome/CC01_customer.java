package Collection_ClassRome;

import java.util.Scanner;

class Customer implements Comparable<Customer>
{
	private int id;
	private String name;
	private String email;
	
	public Customer()
	{
		
	}
	
	public Customer(int id,String name,String email)
	{
		super();
		this.id=id;
		this.name=name;
		this.email=email;	
	}
	
	
	
	public int getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	@Override
	public String toString() 
	{
		 
		return "("+ getId()+","+getName()+","+getEmail()+")";
	}

	
	// for treeSet  in sorting this will make use
	@Override
	public int compareTo(Customer c2) 
	{
		Customer c1=this;
	 
	    //	compare based on id
		// for increasing order 1-2-3-4-5-6
		return  c1.id-c2.id;
		// for decreasing order 6-5-4-3-2-1
//		return c2.id-c1.id;
		
		// based on name and email
		
//		if ( c1.name.compareTo(c2.name) == 0)
//		{
//			return c1.email.compareTo(c2.email);
//		} 
//		else
//		{
//			return c1.name.compareTo(c2.name);
//		}
		
	}

}

public class CC01_customer 
{

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter n");
		int n = scan.nextInt();
		
		Customer[] ar=new Customer[n];
		
		for(int i=0;i<n;i++)
		{

			System.out.println("enter id");
			int id = scan.nextInt();
			System.out.println("enter name");
			String name = scan.next();
			System.out.println("enter email");
			String email = scan.next();
			
			Customer c=new Customer(id,name,email);
			ar[i]=c;
		}
		
		// wiought overrideing toString method
//		for(int i=0;i<ar.length;i++)
//		{
//			System.out.println(ar[i].getId()+" "+ar[i].getName()+" "+ar[i].getEmail());
//		}
		
		// we have override the toString method in customer class so we 
		//are passing the only objce as argument for println method
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
		
		 
		
	}

}
