package Recursion20;

import java.util.Scanner;

public class Prime {
	static int i=2;

	public static void main(String[] args) {
		if(isprime(9))
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("not prime");
		}
	}
	public static boolean isprime(int n)
	{
		if(i==n/2+1)
		{
			return true;
		}
		if(n%i==0)
		{
			return false;
		} 
		i++;
		return isprime(n);
	}
	}
		
	
	