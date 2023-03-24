package LoopingStatements;

import java.util.Scanner;

public class SumOf {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=scn.nextInt();
//      int num=1234;
      int sum=0;
      while(num>0)
      {
    	 int digit= num%10;
    	  sum=sum+digit;
    	  num/=10;
    	  System.out.println(sum);
      }
	}

}
