package DecisionPrograms;

import java.util.Scanner;

public class LowerCase {

	public static void main(String[] args) {
      Scanner scn=new Scanner(System.in);
      System.out.println("Enter a number");
      int n=scn.nextInt();
  
      if(n>=65 && n<=90)
      {
    	  System.out.println("Upper Case");
      }
      else
    	  System.out.println("Lower case");
     
	}

}
