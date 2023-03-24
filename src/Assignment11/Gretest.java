package Assignment11;

import java.util.Scanner;

public class  Gretest {

	public static void main(String[] args) {
        //Gretest of two numbers
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num1=scn.nextInt();
		
		System.out.println("Enter a Number");
		int num2=scn.nextInt();
		
		if(num1>num2)
		{
			System.out.println(num1+" is Greatest");
		}
		else if(num2>num1)
		{
			System.out.println(num2+" is greatest");
		}else
		{
			System.out.println("Both are Same");
		}
	}

}
