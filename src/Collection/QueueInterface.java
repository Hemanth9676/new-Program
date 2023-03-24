package Collection;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueInterface {

	public static void main(String[] args) {
      Queue q=new ArrayDeque();
      q.add(10);
      q.add(20);
      q.add(30);
      System.out.println(q);
      System.out.println("------------");
      System.out.println(q.size()+" size is ");
      System.out.println("-------------");
      System.out.println(q.peek());
      System.out.println(q);
      System.out.println("------------");
      System.out.println(q.poll());
      System.out.println(q);
      System.out.println("------------");
      System.out.println(q.remove());
      System.out.println(q);
      System.out.println("---------------------");
      q.clear();
      System.out.println(q);
      System.out.println("----------------");
      System.out.println(q.isEmpty());
	}

}
