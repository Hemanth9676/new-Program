package TestYantraAllNumberProgramms;

import java.util.Scanner;

public class StartEvenOrNot {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=scn.nextInt();
		int rev=0;
		while(num!=0)
		{
		int rem=num%10;
		rev=rev*10+rem;
		num/=10;
		}
		if(rev%2==0)
		{
		System.out.println("The number starts with even");
		}
		else
		{
		System.out.println("The number does not start with even number");
		}
		}
		}