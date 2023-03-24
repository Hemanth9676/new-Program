package Recursion20;

import java.util.Scanner;

public class Perfect {
	
    static int sum = 0;
    static int i = 1;
    static int perfect(int number, int i) {
        
            if(i<=number/2)
              {
                if(number%i==0)
                {
                    sum+=i;
                }
                i++;
                perfect(number,i);
            }
            return sum;
        }
    
    public static void main(String args[])
    {
    	Scanner scn=new Scanner(System.in);
    	System.out.println("Enter a number");
    	int number = scn.nextInt();
        int result = perfect(number,i);
        if(result == number)
            System.out.println("It is Perfect Number");
        else System.out.println("It is not Perfect Number");
    }
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	