package CollectionProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Shop{
	int price;

	int size;
	public Shop(int price, int i)

	{
		this.price = price;

		this.size = i;

	}

	public String toString()

	{
		return this.price + " " + this.size;
	}
}

class Sort implements Comparator{

	// Sorting in ascending order of item number

	

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return ((Shop)o2).price-((Shop)o1).price;
	}
}

public class Pizza {

	public static void main(String[] args) {
     
	{
		ArrayList<Shop>  ar = new ArrayList<Shop>();

		ar.add(new Shop(100, 1));

		ar.add(new Shop(200, 2));

		ar.add(new Shop(400, 4));

		ar.add(new Shop(600, 8));
		
		ar.add(new Shop(900, 12));
		
		

		// Display message on console for better readability

		System.out.println("Unsorted");


		// Iterating over entries to print them

		for (int i = 0; i < ar.size(); i++)

			System.out.println(ar.get(i));


		// Sorting student entries by roll number

		Collections.sort(ar, new Sort());


		// Display message on console for better readability
		System.out.println("---------------------------------");
		System.out.println("Sorted by item");


		// Again iterating over entries to print them

		for (int i = 0; i < ar.size(); i++)

			System.out.println(ar.get(i));

	}
}
}
