package Collection;

import java.util.ArrayList;
import java.util.ListIterator;
public class ListIterator1 {

	public static void main(String[] args) {
     ArrayList l=new ArrayList();
     l.add(10);
     l.add(20);
     l.add(30);
     l.add(40);
     System.out.println(l);
     ListIterator l1 = l.listIterator();
     while(l1.hasNext())
     {
    	 System.out.println(l1.next());
    	
     }
     System.out.println("----------------");
     while(l1.hasPrevious())
     {
    	 System.out.println(l1.previous());
     }
    
	}

}
