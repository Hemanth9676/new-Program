package DecisionPrograms;

import java.util.Scanner;

public class StudPer {

	public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter a Year: ");
        int year=scn.nextInt();
        System.out.println("Enter a Percentage");
        int per=scn.nextInt();
        
//        int y=2;
        if(year==2)
        {
        	if(per>=80)
        	{
        		System.out.println("Yur are Distinction");
        	}
        	else if(per>=60 && per<=80)
        	{
        		System.out.println("First class");
        	}
        	else if(per>=35 && per<=60)
        	{
        		System.out.println("Second Class");
        	}
        	else if(per<=35)
        	{
        		System.out.println("Your are Fail");
        	}
        }
        else
        {
        	System.out.println("Your Not a Second class Student");
        }
	}

}
