package com.test.yantra;

import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
          Scanner scn=new Scanner(System.in);
          System.out.println("Enter a num");
          int n=scn.nextInt();
          if(n%2==0)
          {
        	  System.out.println(n+"is Even");
          }
          else
          {
        	  System.out.println(n+"is Odd");
          }
	}

}
