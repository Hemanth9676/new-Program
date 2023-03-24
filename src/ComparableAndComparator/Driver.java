package ComparableAndComparator;

import java.util.Arrays;

public class Driver {

	public static void main(String[] args) {
      Car[] c1= {new Car(50000),
                 new Car(80000),
                 new Car(90000),
                 new Car(40000),
                 new Car(10000),
      };
      Arrays.sort(c1);
      for(Car s:c1)
      {
    	  System.out.println(s);
      }
      
	}

}
