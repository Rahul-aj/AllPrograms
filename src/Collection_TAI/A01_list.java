package Collection_TAI;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;


class Restorant  implements Comparable<Restorant>
{
	private int FId;
	private String FoodName;
	private String Type;
	private  int   cost;
	public Restorant(int FId, String foodName, String type, int cost) {
		super();
		this.FId = FId;
		FoodName = foodName;
		Type = type;
		this.cost = cost;
	}
	public int getMid() {
		return FId;
	}
	public String getFoodName() {
		return FoodName;
	}
	public String getType() {
		return Type;
	}
	public int getCost() {
		return cost;
	}
	@Override
	public String toString() {
		return " [" + FId + ", " + FoodName + ", " + Type + ", " + cost + "]";
	}
	@Override
	public int compareTo(Restorant o2)
	{
		Restorant o1=this;
		
		if( o1.Type.compareTo(o2.Type)==0)
		{
			return o1.FoodName.compareTo(o2.FoodName);
		}
		return o1.Type.compareTo(o2.Type);
		 
	}
		
	
}

public class A01_list 
{

	public static void main(String[] args) 
	{
		
//		HashSet<Restorant> set = new HashSet<Restorant>();
//		LinkedHashSet<Restorant> set = new LinkedHashSet<Restorant>();
		
		TreeSet<Restorant> set = new TreeSet<Restorant>();
		
		
		set.add(new Restorant (1,"veg thali","meals",200));
		set.add(new Restorant (2,"non_veg thali","meals",300));
		set.add(new Restorant (3,"veg_Pulav","Rice",150));
		set.add(new Restorant (4,"biriyani","Rice",250));
		set.add(new Restorant (1,"veg thali","meals",200));
	 
		
		for(Restorant x: set)
		{
			System.out.println(x);
		}
		
		
	}

}
