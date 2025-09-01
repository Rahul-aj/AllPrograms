package Collection_TAI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
 
 class Myclass implements Comparator<Map.Entry<String, Integer>>
 {

	@Override
	public int compare( Map.Entry<String, Integer> e1,  Map.Entry<String, Integer> e2) 
	{
		 
		if( e1.getValue().compareTo(e2.getValue())==0)
		{
			return e1.getKey().compareTo(e2.getKey());
		}
		
		return e1.getValue().compareTo(e2.getValue());
	}

 }

public class A10map   
{

	public static void main(String[] args) 
	{
//		HashMap<String ,Integer> map = new HashMap<String ,Integer>();
		TreeMap<String ,Integer> map = new TreeMap<String ,Integer>( );
		
		
		map.put("rahul", 23);
		map.put("ragu", 32);
		map.put("navu", 21);
		map.put("naveen", 21);
		map.put("rahul", 20); 
		map.put("aahul", 20);
		map.put("apsana", 13);
		map.put("nayana", 12);
		map.put("basu", 23);
		
		
		 for( Map.Entry<String, Integer> e: map.entrySet() )
		 {
			 System.out.println(e.getKey()+":"+e.getValue());
		 }
		   
		 
		 System.out.println("..............................");	 
		 
		 // creat object for custom sorting
		 Myclass my1 = new Myclass();
		 
		 // for sorting creat treeSet and pass  comparatore object(my1);
		 TreeSet<Map.Entry<String, Integer>> set = new TreeSet<>(my1);
		 set.addAll(map.entrySet());
		 
		 for( Map.Entry<String, Integer> x  : set)
		 {
			 System.out.println(x);
		 }
	}
}
