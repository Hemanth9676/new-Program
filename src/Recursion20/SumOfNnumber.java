package Recursion20;

import java.util.Scanner;

public class SumOfNnumber {
	public static int sum(int n)
	{
		if(n<=0)
		{
			return n;
		}
		else
		{
			return n+sum(n-1);
		}
	}

	public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=scn.nextInt();
        System.out.println(sum(n));
        
	}

}
