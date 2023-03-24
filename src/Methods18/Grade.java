package Methods18;

import java.util.Scanner;

public class Grade {
	public static void grade()
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number");
		int marks=scn.nextInt();
		if(marks>90)
		{
			System.out.println("A GRADE");
		}
		else if(marks>80 && marks<=90)
		{
			System.out.println("B GRADE");
		}
		else if(marks>=60 && marks<=80)
		{
			System.out.println("C GRADE");
		}
		else
		{
			System.out.println("D GRADE");
		}
	}

	public static void main(String[] args) {
		grade();
	}

}
