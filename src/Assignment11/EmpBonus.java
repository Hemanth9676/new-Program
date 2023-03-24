package Assignment11;

import java.util.Scanner;

public class EmpBonus {

	public static void main(String[] args) {
		 
//		 int sal;// variable to store emp salary.
//		 double d;//variable to calculate gross salary.
		 System.out.println("Enter total Years of services==>   ");
		 Scanner scn=new Scanner(System.in);
		 int year=scn.nextInt();
		 
		 if(year>5)
		 {
			 System.out.println("Congrats..YES..! your total year of services more than 5 years\n Please Enter your salary..> ");
			 int sal=scn.nextInt();
			  
			 System.out.println("YOUR SALARY IS..> "+sal);
			 System.out.println("YOUR 5% BONUS  IS..> "+sal*0.05);
			 System.out.println("YOUR NET BONUS WITH SALARY IS..> "+(sal+(sal*0.05)));
		  }
		 
		 else
		 {
			 System.out.println("NO BONUS..");
		 }
			

		}
		
	}


