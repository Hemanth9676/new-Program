package Testprograms;

import java.util.Scanner;

public class SumOfFactor {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
	       System.err.println("Enter a number");
	       int num=scn.nextInt();
	       int sum=0;
	       for(int i=1;i<=num;i++)
	       {
	    	   if(num%i==0)
	    	   {
	    		   sum=sum+i;
	    	   }
	    	   System.out.println(sum);
	       }
	       
	}

}
