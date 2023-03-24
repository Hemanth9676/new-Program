package DecisionPrograms;

import java.util.Scanner;

public class BikeBy {

	public static void main(String[] args) {
       Scanner scn=new Scanner(System.in);
       System.out.println("Enter a Money");
       int money=scn.nextInt();
       System.out.println("Enter a Bikes");
       int bikes=scn.nextInt();
       if(money>60000)
       {
    	   if(bikes==1)
    	   {
    		   System.out.println("Money is Sufficient buy a bike");
    	   }
    	   else
    	   {
    		   System.out.println("Not Sufficient");
    	   }
       }
       else
       {
    	   System.out.println("Take Loan From Bank To Buy");
       }
	}

}
