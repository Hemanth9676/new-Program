package Programs13;

import java.util.Scanner;

public class PrimeRange {

	public static void main(String[] args) {
       Scanner scn=new Scanner(System.in);
       System.out.println("Enter a number");
       int num=scn.nextInt();
       
       System.out.println("prime numbers b/w 1 to "+num+"are");
       int count=0;
       for(int i=1;i<=num;i++)
       {
    	   if(i<=1) continue;
    	   boolean flag=true;
    	   for(int j=2;j<=i/2;j++)
    	   {
    		   if(i%j==0)
    		   {
    			   flag=false;
    			   break;
    		   }
    	   }
    	   if(flag)
    	   {
    		   count++;
    		   System.out.println(i);
    	   }
       }
       System.out.println(count+"prime numbers are exist");
       
	}

}
