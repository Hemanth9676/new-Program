package Assignment1123;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
       Scanner scn=new Scanner(System.in);
       System.out.println("Enter 2 numbers");
       int a=scn.nextInt();
       int b=scn.nextInt();
       
       while(a!=b)
       {
    	   if(a>b)
    	   {
    		   a=a-b;
    		   
    	   }
    	   else if(b>a)
    	   {
    		   b=b-a;
    	   }
       }
       System.out.println("Gcd is"+a);
       
     
	}

}
