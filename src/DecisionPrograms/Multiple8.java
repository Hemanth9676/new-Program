package DecisionPrograms;

import java.util.Scanner;

public class Multiple8 {

	public static void main(String[] args) {
       Scanner scn=new Scanner(System.in);
       System.out.println("Enter a number");
       int n=scn.nextInt();
       
       if(n%8==0)
       {
    	   System.out.println("It Is Multiple of 8");
       }
       else
       {
    	   System.out.println("It Is Not Multiple by 8");
       }
	}

}
