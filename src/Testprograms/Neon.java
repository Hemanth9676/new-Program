  package Testprograms;

import java.util.Scanner;

public class Neon {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
	       System.err.println("Enter a number");
	       int num=scn.nextInt();
	       int sq=num*num;
	       int sum=0;
	       int rem=0;
	       while(sq>0)
	       {
	    	    rem=sq%10;
	    	   sum=sum+rem;
	    	   sq/=10;
	       }
	       if(sum==num)
	       {
	    	   System.out.println("It is Neon");
	       }
	       else
	       {
	    	   System.out.println("It Not Neon");
	       }
	}

}
