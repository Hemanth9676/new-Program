package com.test.yantra;

import java.util.Scanner;

public class P5 {

	public static void main(String[] args) {
       Scanner scn=new Scanner(System.in);
       System.out.println("Enter a num");
       int a=scn.hashCode();
       String res=a>0?"positive":"Negitive";
       System.out.println(res);
	}

}
