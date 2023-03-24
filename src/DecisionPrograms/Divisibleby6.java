package DecisionPrograms;

import java.util.Scanner;

public class Divisibleby6 {

	public static void main(String[] args) {
       Scanner scn=new Scanner(System.in);
       System.out.println("Enter a Number");
       int n=scn.nextInt();
       
       if(n%6==0)
       {
    	   System.out.println(n+"It is Divisible by 6");
       }
       else
       {
    	   System.out.println(n+"It Is Not Divisible by 6");
       }
	}

}
