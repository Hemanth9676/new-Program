package DecisionPrograms;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter a Number");
        int num1=scn.nextInt();
        int num2=scn.nextInt();
        int num3=scn.nextInt();
        int sum=0;
        sum=num1+num2+num3;

         if(sum>50)
        {
        	System.out.println("The sum is Greater Than 50");
        }
       
        
        else
        {
        	System.out.println("The Number is Lesser Than 50");
        }
	}

}
