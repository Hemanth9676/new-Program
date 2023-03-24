package Collection;

import java.util.ArrayList;
import java.util.List;

public class ListInterface {

	public static void main(String[] args) {
     List l=new ArrayList();
     l.add(10);
     l.add(20);
     l.add(30);
     l.add(10);
     l.add("abc");
     System.out.println(l);
     System.out.println("---------------------------");
//     l.remove(3);
//     System.out.println(l);
//     System.out.println("---------------------------");
//
//     l.remove(2);
//     System.out.println(l);
//     System.out.println("---------------------------");
//
//     l.remove("abc");
//     System.out.println(l);
//     System.out.println("---------------------------");
         
     List l1=new ArrayList();
     l1.add(10);
     l1.add(20);
     l1.add(30);
     l1.add(10);
     l1.add(50);
     l1.add(60);
     System.out.println(l1);
     System.out.println("-------------------");
//     l.retainAll(l1);
//     System.out.println(l);
//     System.out.println("-------------------");
//     l.removeAll(l1);
//     System.out.println(l);
//     l1.set(0, 90);
//     System.out.println(l1);
//     System.out.println("-------------------");
//     l1.get(1);
//     System.out.println(l1);
//     System.out.println("-------------------");
     l1.indexOf(0);
     System.out.println(l1);
     
     
	}

}
