package Forloop;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
       Scanner scn=new Scanner(System.in);
       System.out.println("Enter a number");
       int num=scn.nextInt();
       int sum=0;
       int rem=0;
       int sq=num*num;
       
       while(sq>0)
       {
    	   rem=sq%10;
    	   sum=sum+rem;
    	   sq/=10;
       }
    	   if(sum==num)
    	   {
    		   System.out.println("Neon number");
    	   }
    	   else
    	   {
    		   System.out.println("Not a Neon Number");
    	   }
       }
	}


