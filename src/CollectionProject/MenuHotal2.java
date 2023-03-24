package CollectionProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Dish{
	int price;

	String item;
	public Dish(int price, String item)

	{
		this.price = price;

		this.item = item;

	}

	public String toString()

	{
		return this.price + " " + this.item;
	}
}

class Sortbyitems implements Comparator<Dish> {

	// Sorting in ascending order of item number

	public int compare(Dish a, Dish b)

	{
		return a.price - b.price;

	}
}

public class MenuHotal2 {


	public static void main(String[] args)

	{
		ArrayList<Dish> ar = new ArrayList<Dish>();

		ar.add(new Dish(100, "Roti"));

		ar.add(new Dish(40, "Idly"));

		ar.add(new Dish(100, "masaladosa"));

		ar.add(new Dish(100, "Fried Rice"));
		ar.add(new Dish(90, "Noodils"));


		// Display message on console for better readability

		System.out.println("Unsorted");


		// Iterating over entries to print them

		for (int i = 0; i < ar.size(); i++)

			System.out.println(ar.get(i));


		// Sorting student entries by roll number

		Collections.sort(ar, new Sortbyitems());


		// Display message on console for better readability
		System.out.println("---------------------------------");
		System.out.println("Sorted by item");


		// Again iterating over entries to print them

		for (int i = 0; i < ar.size(); i++)

			System.out.println(ar.get(i));




	}
}


