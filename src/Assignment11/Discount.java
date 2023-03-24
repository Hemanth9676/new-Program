package Assignment11;

import java.util.Scanner;

public class Discount {
      //shirt discount program
	public static void main(String[] args) {
		
		 
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("enter  cost of 1 shirt Price ");	
		               
		double price=sc.nextDouble();		
		
			System.out.println("How many Shirst you Want");
			int t=sc.nextInt();
			
			price=price*t;
			System.out.println(price+"Total cost of shirts");

		
			 if(price>=1000) {
				System.out.println("Bill More Than 1000 You will get Discount of 10%");
				System.out.println("enter discount percentage ");	

			}

			
			else {
				System.out.println("You will Not Get Discount");
				System.out.println(price+"Pay on total Bill");
			}
		        	   	               
			double dis=sc.nextDouble();			
			
		       double s=100-dis;
		 
			double amount= (s*price)/100;
		 
			System.out.println("amount after discount="+amount);
		 
			}

	}


