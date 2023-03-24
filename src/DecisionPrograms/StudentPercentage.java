package DecisionPrograms;

import java.util.Scanner;

public class StudentPercentage {

	public static void main(String[] args) {
      Scanner scn=new Scanner(System.in);
      System.out.println("Enter a Percentage");
      int per=scn.nextInt();
      
      if(per>=85)
      {
    	  System.out.println("Distinction");
      }
      else if(per<=85 && per>=35)
      {
    	  System.out.println("First class");
      }
      else
      {
    	  System.out.println("Fail");
      }
	}

}
