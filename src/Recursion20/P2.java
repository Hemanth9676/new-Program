package Recursion20;

import java.util.Scanner;

public class P2 {
	public static int Happy(int n) {
	if(n<=1)
	{
		return n;
	}
	else {
        
        System.out.println("Happy Birthday");
	}
        return Happy(n);
	}

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
        System.out.println("Enter a name");
        int n=scn.nextInt();
          Happy(n);
	}

}
