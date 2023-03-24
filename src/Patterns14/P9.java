package Patterns14;

import java.util.Scanner;

public class P9 {

	public static void main(String[] args) {
		 Scanner scn=new Scanner(System.in);
	      System.out.println("Enter a number");
	      int num=scn.nextInt();
	      int temp=1;
	      for(int i=1;i<=num;i++)
	      {
	    	  for(int j=1;j<=num;j++)
	    	  {
//	    		 
	    		  System.out.print(temp +" ");
	    		  temp++;
	    		  
	    	  }
	    	  
	
	      System.out.println();
	      }

}
}
