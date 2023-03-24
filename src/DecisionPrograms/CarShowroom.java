package DecisionPrograms;

import java.util.Scanner;

public class CarShowroom {

	public static void main(String[] args) {
       Scanner scn=new Scanner(System.in);
       System.out.println("You Choose A Car");
       String car=scn.next();
       
       switch(car)
       {
       case "AUDI":
    	   System.out.println("AUDI is a Nice Car");
    	   break;
    	   
       case "BMW":
    	   System.out.println("BMW is a Nice Car");
    	   break;
    	   
       case "TYOTO":
    	   System.out.println("TYOTO is a Nice Car");
    	   break;
       case "FERRARI":
    	   System.out.println("FERRARI is a Nice Car");
    	   break;
    	   default: System.out.println("Ask a valid Car");
    	   
       }
	}

}
