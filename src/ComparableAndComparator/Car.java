package ComparableAndComparator;

public class Car implements Comparable{
      int price;
      public Car(int price)
      {
    	  this.price=price;
      }
      public String toString()
      {
    	  return "price"+ price;
      }
      public int compareTo(Object o)
      {
    	  Car c1=(Car)o;
    	 return this.price-c1.price;
      }
      

	}


