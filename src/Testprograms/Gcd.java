package Testprograms;

import java.util.Scanner;

public class Gcd {

	public static void main(String[] args) {
       Scanner scn=new Scanner(System.in);
       System.err.println("Enter 2 number");
       int num1=scn.nextInt();
       int num2=scn.nextInt();
//       int gcd=1;
//       for(int i=1;i<=num1 && i<=num2;i++)
//       {
//    	   if(num1%i==0 && num2%i==0)
//    	   {
//    		   gcd=i;
//    	   }
//    	   System.err.println(gcd);
       if(num1>num2)
       {
    	  num1=num1-num2;
       }
       if(num2>num1)
       {
    	   num2=num2-num1;
       }
       System.out.println(num1);
       
	}

}
