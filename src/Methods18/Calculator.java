package Methods18;

import java.util.Scanner;

public class Calculator {
	public static void add()
	{
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
	public static void sub()
	{
		int a=10;
		int b=20;
		System.out.println(a-b);	
	}
	public static void pro()
	{
		int a=10;
		int b=20;
		System.out.println(a*b);
		
	}
	public static void div()
	{
		int a=10;
		int b=20;
		System.out.println(a/b);
		
	}
	public static void reminder()
	{
		int a=10;
		int b=20;
		System.out.println(a%b);
		
	}
	public static void discount()
	{
		int a=1000;
		int b=2;
		int dis=(a*b)/100;
		System.out.println(dis);
		
	}
	

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scn.nextInt();
		
		switch(n)
		{
		case 1:add();
		break;
		case 2:sub();
		break;
		case 3:pro();
		break;
		case 4:div();
		break;
		case 5:reminder();
		break;
		case 6:discount();
		break;
		}
    
	}

}
