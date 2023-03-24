package ComparableAndComparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Robo implements Comparable<Robo>
{
	String brand;
	int price;
	public Robo(String brand,int price)
	{
		this.brand=brand;
		this.price=price;
	}
	public String toString()
	{
		return "Brand "+brand+" Price "+price;
	}
	public int compareTo(Robo r1)
	{
		
		if(price>r1.price) return 1;
		if(price<r1.price) return -1;
		return 0;
		
	}
}


public class Firdge {

	public static void main(String[] args) {
     Robo[] r= { new Robo("LG",19000),
    		    new Robo("SAMSUNG",17000),
    		    new Robo("Realme",15000),
    		    new Robo("Pristge",12000)};
     Arrays.sort(r);
     for(Robo d:r)
     {
    	 System.out.println(d);
     }
//		ArrayList<Robo>l=new ArrayList<Robo>();
//		l.add(new Robo("Lg",800));
//		l.add(new Robo("Sam",100));
//		l.add(new Robo("Redmi",500));
//		l.add(new Robo("Vivo",580));
//		Collections.sort(l);
////		System.out.println(l);
//		for(Robo v:l)
//		{
//			System.out.println(v);
//		}
//		
     }
	}


