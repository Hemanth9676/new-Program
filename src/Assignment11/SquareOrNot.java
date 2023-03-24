package Assignment11;

import java.util.Scanner;

public class SquareOrNot {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter Length");
		int num1=scn.nextInt();
		
		System.out.println("Enter breadth"); 
		int num2=scn.nextInt();
		
		
		if(num1==num2)
		{
			System.out.println("It is Square");
		}
		else
		{
			System.out.println("It is Rectangle ");
		}
	}

}
