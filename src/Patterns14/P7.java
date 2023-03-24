package Patterns14;

import java.util.Scanner;

public class P7 {

	public static void main(String[] args) {
		 Scanner scn=new Scanner(System.in);
	      System.out.println("Enter a number");
	      int num=scn.nextInt();
	      for(int i=1;i<=num;i++)
	      {
	    	  for(int j=1;j<=num;j++)
	    	  {
	    		  System.out.print(i+" ");
	    	  }
	    	  System.out.println();
	      }
	}

}
