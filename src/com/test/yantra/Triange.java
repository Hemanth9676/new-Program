package com.test.yantra;

import java.util.Scanner;

public class Triange {

	public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter a Sides");
        int side1=scn.nextInt();
        int side2=scn.nextInt();
        int side3=scn.nextInt();
        
        if(side1==side2 && side1==side3 && side2==side3 )
        {
        	System.out.println("It is Equilateral Triangle");
        }
        else if(side1==side2 || side2==side3 || side3==side1)
        {
        	System.out.println("It is a Isoceles Triangle");
        }
        else
        {
        	System.out.println("It is Scalene Triangle");
        }
        
	}

}
