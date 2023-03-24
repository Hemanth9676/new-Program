package Collection;

import java.util.ArrayDeque;
import java.util.Queue;

public class DeQueMethods {

	public static void main(String[] args) {
     ArrayDeque q=new ArrayDeque();
     q.add(10);
     q.add(20);
     q.add(30);
      
     System.out.println(q);
     System.out.println("---------------------");
     q.addFirst("Hemanth");
     q.addLast("Venkata");
     System.out.println(q);
     System.out.println("---------------------");
     q.pollFirst();
     q.pollLast();
     System.out.println(q);
     System.out.println("---------------------");
     q.peekFirst(); 
     q.peekLast();
     System.out.println(q);
     System.out.println("---------------------");
     
     
	}

}
