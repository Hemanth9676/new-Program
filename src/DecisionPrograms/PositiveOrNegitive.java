package DecisionPrograms;

import java.util.Scanner;

public class PositiveOrNegitive {

	public static void main(String[] args) {
       Scanner scn=new Scanner(System.in);
       System.out.println("Enter a number:");
       int n=scn.nextInt();
       
       if(n>0)
       {
    	   System.out.println(n+"is Positive Number");
       }
       else
       {
    	   System.out.println(n+"is Negitive Number");
       }
	}

}
