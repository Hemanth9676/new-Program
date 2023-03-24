package TestYantraAllNumberProgramms;

import java.util.Scanner;

public class PrimeSumOfRange {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a Number1");
		int n1=scn.nextInt();
		System.out.println("Enter a Number2");
		int n2=scn.nextInt();
		int sum=0;
		for(int i=n1;i<=n2;i++)
		{
			int count=0;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					count++;
					
				}
			}
			if(count==0)
			{
				sum+=i;			
			}
		}
		System.out.println(sum);
	}

}
