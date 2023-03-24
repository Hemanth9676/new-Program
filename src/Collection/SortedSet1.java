package Collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSet1 {

	public static void main(String[] args) {
      SortedSet s=new TreeSet();
      s.add(10);
      s.add(20);
      s.add(30);
      s.add(40);
      s.add(50);
      System.out.println(s);
      s.first();
      System.out.println(s+"first");
      s.last();
      System.out.println(s+"last");
      
      System.out.println(s.headSet(50));
      
      System.out.println(s.tailSet(40));
      
      System.out.println(s.subSet(20, 50));
	}

}
