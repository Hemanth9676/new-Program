package TestYantraAllNumberProgramms;

import java.util.Scanner;

public class BuzzNumber {

	public static void main(String[] args) {
   Scanner scn=new Scanner(System.in);
   System.out.println("Enter a Number");
   int n=scn.nextInt();
        int rem=n%10;
	   if(n%10==7 || rem%7==0)
	   {
		   System.out.println("it is Buzz Number");
	   }
	   else
	   {
		   System.out.println("Not a Buzz Number");
	   }
   }
	}


