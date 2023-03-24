package CollectionProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class MenuHotal  implements Comparable{

//	public static void main(String[] args) {
//     Map m=new TreeMap();
//     m.put(100,"Roti");
//     m.put(40,"idly");
//     m.put(100,"masaladosa");
//     m.put(100,"Fried rice");
//     m.put(90,"Noodles");
//     System.out.println(m);
		
		
//		ArrayList s=new ArrayList();
//		s.add(100);
//		s.add("Roti");
//		
//		s.add(40);
//		s.add("Idly");
//		
//		s.add(100);
//		s.add("MasalaDosa");
//		
//		s.add(100);
//		s.add("Fried Rice");
//		
//		s.add(90);
//		s.add("Noodils");
//		Arrays.sort(s);
//		
//		System.out.println(s);
//		
		
		String item;
		int price;
		public MenuHotal (String n,int p)
		{
			this.item=n;
			this.price=p;
		}
		public String toString()
		{
			return "MenuHotal[item="+item+"price="+price+"]";
		}
		@Override
		public int compareTo(Object org)
		{
			MenuHotal e= (MenuHotal) org;
			return item.compareTo(e.item);     
	}
		

}
