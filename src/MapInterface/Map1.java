
package MapInterface;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;

public class Map1 {

	public static void main(String[] args) {
		Map m=new Hashtable();
		m.put(101,"Hemanth");
		m.put(103,"Hemanth");
		m.put(107,"Hemanth");
		m.put(105,"Chitti");
		m.put(102,"Robo");
		System.out.println(m);
		System.out.println(m.put(101, "abbas"));
		System.out.println(m.get(101));//adding the name 
		System.out.println(m);
		System.out.println("_-----------------");

		m.remove(101, "abbas");  // removing the data.
		System.out.println(m);
		System.out.println("_-----------------");

		m.remove(107);
		System.out.println(m);  // remove 107 data.
		System.out.println("_-----------------");


		System.out.println(m);

	}

}
