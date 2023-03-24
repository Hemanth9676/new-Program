package Assignment1123;

import java.util.Scanner;

public class Fcator {

	public static void main(String[] args) {
       Scanner scn=new Scanner(System.in);
       System.out.println("Enter a number");
       int num=scn.nextInt();
       int sum=0;
       for(int i=1;i<=num;i++)
       {
    	   if(num%i==0)
    	   {
    		   sum=sum+i;
    		   
    	   }
       }
       System.out.println(sum);
	}

}
