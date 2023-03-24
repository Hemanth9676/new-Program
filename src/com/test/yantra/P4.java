package com.test.yantra;

import java.util.Scanner;

public class P4 {

	public static void main(String[] args) {
      Scanner scn=new Scanner(System.in);
      System.out.println("Enter a num");
      int a=scn.nextInt();
//      int b=scn.nextInt();
     String res=a%2==0?"Even":"Odd";
      System.out.println(res);
	}

}
