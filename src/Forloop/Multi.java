package Forloop;

import java.util.Scanner;

public class Multi {

	public static void main(String[] args) {
		//Multiplication Table
		Scanner scn=new Scanner(System.in);
        System.out.println("Enter a Number");
        int num=scn.nextInt();
        
        for(int i=1;i<=10;i++)
        {
        	System.out.println(num+"*"+i+"="+(num*i));
        }
	}

}
