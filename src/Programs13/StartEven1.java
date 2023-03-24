package Programs13;

import java.util.Scanner;

public class StartEven1 {

	public static void main(String[] args) {
     Scanner scn=new Scanner(System.in);
     System.out.println("Enter a number");
     int num=scn.nextInt();
    	 while(num>9)
    	 {
    		 num/=10;
    		 if(num%2==0)
    		 {
    			 System.out.println("The first number is even");
    		 }
    		 else
    		 {
    			 System.out.println("It is not even");
    	 }
     }
	}

}
