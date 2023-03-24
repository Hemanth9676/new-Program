package com.test.yantra;

import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
       Scanner scn=new Scanner(System.in);
       System.out.println("enter a num");
       int a=scn.nextInt();
       int b=scn.nextInt();
//       if(a>b)
//       {
//    	   System.out.println(a+"is greater ");
//       }
//       else if(b>a)
//       {
//    	   System.out.println(b+"is greater");
//       }
//       else {
//    	   System.out.println("both are same");
//       }
       
       int res=a>b?a:b;
       System.out.println(res);
	}

}
