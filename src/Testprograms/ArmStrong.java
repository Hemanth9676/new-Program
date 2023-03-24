package Testprograms;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
	       System.err.println("Enter a number");
	       int num=scn.nextInt();
	       int count=0,temp=num;
	       while(num>0)
	       {
	    	   num/=10;
	    	   count++;
	       }
	       num=temp;
	       int sum=0;
	       while(num>0)
	       {
	    	   int rem=num%10;
	    	   int fact=1;
	    	   for(int i=1;i<=count;i++)
	    	   {
	    		   fact=fact*rem;
	    	   }
	    	   sum=sum+fact;
	    	   num/=10;
	       }
	       if(sum==temp)
	       {
	    	   System.out.println("It is Armstrong");
	       }
	       else
	       {
	    	   System.out.println("Not Armstrong");
	       }
	       
	}

}
