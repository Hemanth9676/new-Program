package Testprograms;

import java.util.Scanner;

public class Multi {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
	       System.err.println("Enter a number");
	       int num=scn.nextInt();
	       for(int i=1;i<=10;i++)
	       {
	    	   System.out.println(num+"*"+i+"="+(num*i));
	       }
	}

}
