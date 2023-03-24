package DecisionPrograms;

import java.util.Scanner;

public class ProductPositive {

	public static void main(String[] args) {
//       Scanner scn=new Scanner(System.in);
//       System.out.println("Enter a  num");
//       int n=scn.nextInt();
       int i=1;
       int prod=1;
       do
       {
    	    if(i%2==0) 
    	    {
    	    	prod=prod*1;
    	    	i++;
    	    	
    	    }
    	    System.out.println(prod);
//	    	i++;
       }while(i<=10);
	}

}
