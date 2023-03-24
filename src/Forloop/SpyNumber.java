package Forloop;

import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {
         Scanner scn=new Scanner(System.in);
         System.out.println("Enter a Number");
         int num=scn.nextInt();
         
         int rem=0;
         int sum=0;
         int prod=1;
         while(num>0)
         {
        	 rem=num%10;
        	 sum=sum+rem;
        	 //System.out.println(sum);
        	 prod=prod*rem;
        	 //System.out.println(prod);
        	 num/=10;
        
         }
        	 
        	 if(sum==prod)
        	 {
        		 System.out.println("It is Spy Number");
        	 }
        	 else
        		 {
        			 System.out.println("Not a Spy Number");
        		 }
         
        	 
         
	}

}
