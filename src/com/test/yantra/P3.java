package com.test.yantra;

import java.util.Scanner;

public class P3 {

	public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter a num");
        int a=scn.nextInt();
        int b=scn.nextInt();
        int res=a<b?a:b;
        System.out.println(res);
	}

}
