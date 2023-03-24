package TestYantraAllNumberProgramms;

import java.util.Scanner;

public class PrimeRange {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number1");
		int n1=scn.nextInt();
		System.out.println("Enter a number2");
		int n2=scn.nextInt();
		
		for(int i=n1;i<=n2;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
		
		if(count==2)
		{
			System.out.println(i);
		}
		}
	}

}
