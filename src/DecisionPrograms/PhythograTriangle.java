package DecisionPrograms;

import java.util.Scanner;

public class PhythograTriangle {

	public static void main(String[] args) {
      Scanner scn=new Scanner(System.in);
      System.out.println("Enter 3 Inputs");
      int a=scn.nextInt();
      int b=scn.nextInt();
      int c=scn.nextInt();
      
      if(a*a + b*b == c*c)
      {
    	System.out.println("It is Phythagrous");  
      }
      else if(c*c + b*b == a*a)
      {
    	  System.out.println("It is Phythagrous"); 
      }
      else if(a*a + c*c == b*b)
      {
    	  System.out.println("It is Phythagrous"); 
      }
      else
      {
    	  System.out.println("Not a Phythagrous");
      }
	}

}
