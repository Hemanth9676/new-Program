package TestYantraAllNumberProgramms;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    System.out.println("Enter a Number");
    int n=scn.nextInt();
    int sq=n*n;
    int sum=0;
    while(sq>0)
    {
    	int rem=sq%10;
    	sum+=rem;
    	sq/=10;
    }
    if(sum==n)
    {
    	System.out.println("Neon");
    }
    else
    {
    	System.out.println("Not Neon");
    }
	}

}
