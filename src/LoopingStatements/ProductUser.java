package LoopingStatements;

import java.util.Scanner;

public class ProductUser {

	public static void main(String[] args) {
		//product of positive number 
     Scanner scn=new Scanner(System.in);
        System.out.println("Enter a Number");
        int num=scn.nextInt();
        int i=1;
        int prod=1;
       do
       {
    	   if(num>0)
    	   prod=prod*i;
    	   i++;
       }
       while(i<=5);
       
        System.out.println(prod);
	}
	}


