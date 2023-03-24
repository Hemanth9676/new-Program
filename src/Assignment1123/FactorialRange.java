package Assignment1123;

import java.util.Scanner;

public class FactorialRange {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		
		int num = input.nextInt();
		
		int result = factorialRecursion(num);
		
		System.out.println(result);
		}
		public static int factorialRecursion(int num) {
		if (num == 0 || num == 1)
		return 1;
		return factorialRecursion(num - 1) * num;
	
		
		
		
		
		}
		
	}


