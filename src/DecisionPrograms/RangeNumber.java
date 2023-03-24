package DecisionPrograms;

import java.util.Scanner;

public class RangeNumber {

	public static void main(String[] args) {
       Scanner scn=new Scanner(System.in);
       System.out.println("Enter a Number");
       int num=scn.nextInt();
       
       if(num>100)
       {
    	   if(num<200)
    	   {
    		   System.out.println("The Number in the Range100 to 200");
    	   }
    	   else
    	   {
    		   System.out.println("Not in the Range 100 to 200");
    	   }
       }
       else
       {
    	   System.out.println("The Number is lesser than 100");
       }
	}

}
