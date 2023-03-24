package Patterns14;

import java.util.Scanner;

public class P27 {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
	      System.out.println("Enter a number");
	      int n=sc.nextInt();
	      for(int i=5;i>=1;i--) {
	    	  for(int j=5;j>=i;j--) {
	    		  System.out.print(i);
	    	  }
	    	  n--;
	    	  System.out.println();
	      }
	       }
	}


