package DecisionPrograms;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
         Scanner scn=new Scanner(System.in);
         System.out.println("Enter a num");
         int n=scn.nextInt();
         
         if(n%2==0)
         {
        	 System.out.println(n+"is a Even number");
         }
         else
         {
        	 System.out.println(n+"is Odd Number");
         }
	}
		
	    
	} 


