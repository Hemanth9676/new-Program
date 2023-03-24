package ComparableAndComparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

class Mobile
{
	String brand;
	int price;
	String color; 
	public Mobile(String brand,int price,String color)
	{
		this.brand=brand;
		this.price=price;
		this.color=color;
	}
	public String toString()
	{
		return "Brand "+brand+" Price"+price+" Color "+color;
	}
	public static void main(String[] args) {
		Mobile c1=new Mobile("Hp", 400, "Black");
		Mobile c2=new Mobile("Dell", 500, "Gray");
		Mobile c3=new Mobile("Avita", 100, "red");
		Mobile c4=new Mobile("Lenovo", 700, "naviblue");
		
		TreeSet<Mobile> t1=new TreeSet<Mobile>();
		t1.add(c1);
		t1.add(c2);
		t1.add(c3);
		t1.add(c4);
        
//		Arrays.sort(t);
		for(Mobile a:t1)
		{
			System.out.println(a);
		}
	}
}
class Rk implements Comparator<Mobile>
{

	public int compare(Mobile s1, Mobile s2) {
//		Shop1 s1=(Shop1)o1;
//		Shop1 s2=(Shop1)o2;
//		return s1.price-s2.price;
		if(s1.price>s2.price) return 1;
		if(s1.price<s2.price) return -1;
		return 0;
 	}	
}
