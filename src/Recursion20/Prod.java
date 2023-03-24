package Recursion20;

import java.util.Scanner;

public class Prod {
	public static int prod(int n)
	{
		if(n<=1)
		{
			return n;
		}
		else
		{
			return n*prod(n-1);
		}
	}

	public static void main(String[] args) {
       Scanner scn=new Scanner(System.in);
       System.out.println("Enter a number");
       int n=scn.nextInt();
       System.out.println(prod(n));
	}

}
