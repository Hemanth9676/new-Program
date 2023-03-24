package ComparableAndComparator;

import java.util.Arrays;
import java.util.Comparator;

class Laptop
{
	String brand;
	double price;
	String color; 
	public Laptop(String brand,double price,String color)
	{
		this.brand=brand;
		this.price=price;
		this.color=color;
	}
	public String toString()
	{
		return "Brand "+brand+" Price"+price+" Color "+color;
	}
}
class Shop implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		Laptop l1=(Laptop)o1;
		Laptop l2=(Laptop)o2;
		return (int) (l1.price-l2.price);
 	}
	
}
public class Sale {

	public static void main(String[] args) {
        Laptop[] ll= {new Laptop("HP",15000,"BLACK"),
        		new Laptop("AVITA",10000,"GRAY"),
        		new Laptop("DELL",25000,"NAVIBLUE"),
        		new Laptop("LENOVO",39000,"RED")};
        
        Arrays.sort(ll,new Shop());
        for(Laptop s:ll)
        {
        	System.out.println(s);
        		
        }
	}

}
