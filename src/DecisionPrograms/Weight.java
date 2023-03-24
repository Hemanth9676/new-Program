package DecisionPrograms;

import java.util.Scanner;

public class Weight {

	public static void main(String[] args) {
      Scanner scn=new Scanner(System.in);
      System.out.println("Enter a Age");
      int age=scn.nextInt();
      System.out.println("Enter a Your Weight");
      int weight=scn.nextInt();
      
      if(age>25)
      {
    	  if(weight>60)
    	  {
    		  System.out.println("Your Eligible for Boxing Compitation");
    	  }
    	  else
    	  {
    		  System.out.println("Not Eligible");
    	  }
      }
      else
      {
    	  System.out.println("Under age Not Eligible");
      }
	}

}
