package DecisionPrograms;

import java.util.Scanner;

public class Subjects {

	public static void main(String[] args) {
          Scanner scn=new Scanner(System.in);
          System.out.println("Avalible  Subjects");
          System.out.println("1.Telugu");
          System.out.println("2.Hindi");
          System.out.println("3.Sanskrit");
          System.out.println("4.Kannada");
          System.out.println("5.English");
          System.out.println("You Choose a Subject");
          int sub=scn.nextInt();
          
          switch(sub)
          {
          case 1: 
          {
        	  System.out.println("You Chosse for Telugu 1st Language and all the Best");
          }
          break;
          case 2:
          {
        	  System.out.println("You Chosse for Hindi 1st Language and all the Best");
        	  
          }
          break;
          case 3:
        	  System.out.println("You Chosse for Sanskrit 1st Language and all the Best");
        	  break;
          case 4:
        	  System.out.println("You Chosse for Kannada 1st Language and all the Best");
        	  break;
          case 5:
        	  System.out.println("You Chosse for English 1st Language and all the Best");
        	  break;
        	  default: System.out.println("choose valid subjects");
          }
          
	}

}
