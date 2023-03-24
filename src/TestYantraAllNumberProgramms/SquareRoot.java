package TestYantraAllNumberProgramms;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=scn.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i*i==n)
			{
				System.out.println("Square Root is "+i);
			}
		}
	}

}
