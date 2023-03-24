package DecisionPrograms;

import java.util.Scanner;

public class AirTickets {

	public static void main(String[] args) {
          Scanner scn=new Scanner(System.in);
          System.out.println("Choose Your Choice");
          int ticket=scn.nextInt();
          
          switch(ticket)
          {
          case 1:
        	  System.out.println("You Choose for Business class");
          
        	  break;
        	 
           case 2:
            	  System.out.println("You Choose for Economical class");
            	  break;
            	 
            case 3:
                	  System.out.println("You Choose for Luxury class");
                	  break;
                	  default: System.out.println("Choose Valid Class");
          }
	}

}
