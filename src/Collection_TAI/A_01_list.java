package Collection_TAI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

 

 class Student  
{
	private int id;
	private String name;
	private String email;
	private int age;
	
	public Student(int id, String name, String email, int age) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public int getAge() {
		return age;
	}


	@Override
	public String toString() {
		return " ["+ id + ","+ name + ", " + email + ", " + age + "]";
	}

//	@Override
//	public int compareTo(Student o2) {
//		 Student o1=this;
//		 
//		 if((o1.id-o2.id)==0)
//		 {
//			 return o1.name.compareTo(o2.name);
//		 }
//		return o1.id-o2.id;
//		 
//		  
//	}
		
}

class Myclass1 implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2)
	{
		 
		return o1.getId()-o2.getId();
	}	
	
}

class Myclass2 implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		 
		return o1.getName().compareTo(o2.getName());
		 
	}
}


public class A_01_list    
{

	public static void main(String[] args) 
	{
 
//		HashSet<Student> list = new HashSet<Student>();
//		LinkedHashSet<Student> list = new LinkedHashSet<Student>();
		
		Myclass1 my1 = new Myclass1();
		
		Myclass2 my2 = new Myclass2();
		
		TreeSet<Student> list = new TreeSet<Student>(my1);
  
		 list.add(new Student(1,"rahul","rahul@gmail.com",23));
		 list.add(new Student(1,"rahul","rahul@gmail.com",23));
		 list.add(new Student(1,"anu","anu@gmail.com",23));
		 list.add(new Student(2,"cheetan","cheetan@gmail.com",24));
		 list.add(new Student(3,"rahul","rahul@gmail.com",23));
		 list.add(new Student(2,"manu","manu@gmail.com",23));  
		 list.add(new Student(3,"aj","aj@gmail.com",23));
		 list.add(new Student(4,"aagu","aagu@gmail.com",23));
		 
		 for(Student x:list)
		 {
			 System.out.println(x);
		 }
		 

	}
}
