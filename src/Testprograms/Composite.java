package Testprograms;

import java.util.Scanner;

public class Composite {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
	       System.err.println("Enter a number");
	       int num=scn.nextInt();
	       boolean flag=true;
	       if(num<=1)
	       {
	    	   System.out.println("Not a composite");
	    	   return;
	       }
	       for(int i=2;i<=num/2;i++)
	       {
	    	   if(num%i==1)
	    	   {
	    		   flag=false;
	    		   break;
	    	   }
	       }
	       if(flag)
	       {
	    	   System.out.println("Composite");
	       }
	       else
	       {
	    	   System.out.println("Not a Composite");
	       }
	}

}
