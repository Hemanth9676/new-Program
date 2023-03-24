package TestYantraAllNumberProgramms;

import java.util.Scanner;

public class FcatorsFind {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=scn.nextInt();
//    int n=16;
    int sum=0;
    for(int i=1;i<n;i++)
    {
    	if(n%i==0)
    	{
    		System.out.println(i);
    		sum+=i;
    	}
    }
    System.out.println("Total the Number of factors is "+sum);
	}

}
