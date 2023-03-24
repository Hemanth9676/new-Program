package LoopingStatements;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
     Scanner scn=new Scanner(System.in);
     System.out.println("Enter a number");
     int num=scn.nextInt();
     boolean flag=true;
     if(num<=1)
     {
    	 System.out.println("Not a Prime");
    	 return;
     }
     
     for(int i=2;i<=num/2;i++)
     {
    	 if(num%i==0)
    	 {
    		flag=false;
    		break;
    	 }
     }
    	 if(flag)
    	 {
    		 System.out.println("prime");
    	 }
    	 else
    	 {
    		 System.out.println("Not a Prime");
    	 }
    		 
    		 
     }
	}


