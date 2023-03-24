package Forloop;

import java.util.Scanner;

public class Fact {

	public static void main(String[] args) {
		 Scanner scn=new Scanner(System.in);
	       System.out.println("Enter a num");
	       //factorial program
	       int n=scn.nextInt();
	       int prod=1;
	       for(int i=1;i<=n;i++)
	       {
	    	   prod=prod*i;
	       }
	       System.out.println(prod);
		}
	}


