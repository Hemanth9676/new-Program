package DecisionPrograms;

import java.util.Scanner;

public class Shopping {

	public static void main(String[] args) {
         Scanner scn=new Scanner(System.in);
         System.out.println("Enter a Shirt Size");
         int s=scn.nextInt();
         
         switch(s)
         {
         case 28:
         {
        	 System.out.println("Go to Small size section");
         }
         break;
         case 30:
         {
        	 System.out.println("It is Correct Fit for You");
         }
         break;
         default: System.out.println("Enter valid Size");
         }
	}

	
	}


