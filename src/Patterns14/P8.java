package Patterns14;

import java.util.Scanner;

public class P8 {

	public static void main(String[] args) {
		 Scanner scn=new Scanner(System.in);
	      System.out.println("Enter a number");
	      int num=scn.nextInt();
	     for(int i=1;i<=num;i++)
	     {
	    	 for(int j=1;j<=num;j++)
	    	 {
	    		 if(j%2==0)
	    		 {
	    			 System.out.print("0"+" ");
	    		 }
	    		 else
	    		 {
	    			 System.out.print("1"+" ");
	    		 }
	    	 }
	    	 System.out.println();
	     }
	}

}
