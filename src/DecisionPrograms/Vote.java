package DecisionPrograms;

import java.util.Scanner;

public class Vote {

	public static void main(String[] args) {
      Scanner scn=new Scanner(System.in);
      System.out.println("Enter a age");
      int age=scn.nextInt();
      
      if(age>=18)
      {
    	  System.out.println("Eligible to Vote");
      }
      else
      {
    	  System.out.println("Not Eligible for vote");
      }
	}

}
