package Collection;

import java.util.HashSet;
import java.util.Set;

public class SetMethods {

	public static void main(String[] args) {
     Set s=new HashSet();
     s.add(10);
     s.add(20);
     s.add(30);
     s.add(null);
     s.add("Hemanth");
     System.out.println(s);
     System.out.println("-------------------");
     System.out.println(s.isEmpty());
     System.out.println("-------------------");
     System.out.println(s.contains(10));
     System.out.println("-------------------");
     System.out.println(s.containsAll(s));
     System.out.println("-------------------");
     Set s1=new HashSet();
     s1.add(20);
     s1.add(30);
     s1.add(60);
     System.out.println(s1);
     System.out.println("-------------------");
     s.retainAll(s1);
     System.out.println(s+"common elements");
     System.out.println("---------------------");
     s.addAll(s1);
     System.out.println(s);
     System.out.println("-------------------");
     s.removeAll(s1);
     System.out.println(s);
     System.out.println("-------------------");
     s.clear();
     System.out.println(s);
    
    
	}

}
