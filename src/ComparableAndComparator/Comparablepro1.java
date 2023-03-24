package ComparableAndComparator;

import java.util.Arrays;
import java.util.TreeSet;

public class Comparablepro1 implements Comparable<Comparablepro1>{
	int price;
	public Comparablepro1(int price)
	{
		this.price=price;
	}
	@Override
	public String toString()
	{
		return "price"+price;
		
	}
	public int compareTo(Comparablepro1 c)
	{
		//Comparablepro1 c1=(Comparablepro1)c;
		return this.price-c.price;
	}
  
	public static void main(String[] args) {
		Comparablepro1 c1=new Comparablepro1(400);
		Comparablepro1 c2=new Comparablepro1(500);
		Comparablepro1 c3=new Comparablepro1(600);
		Comparablepro1 c4=new Comparablepro1(100);
		Comparablepro1 c5=new Comparablepro1(100);
		
		TreeSet<Comparablepro1> t=new TreeSet<Comparablepro1>();
		t.add(c1);
		t.add(c2);
		t.add(c3);
		t.add(c4);
        
		//Arrays.sort(t);
		for(Comparablepro1 a:t)
		{
			System.out.println(a);
		}
	}

}
