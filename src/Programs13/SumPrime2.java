package Programs13;

import java.util.Scanner;

public class SumPrime2 {

	public static void main(String[] args) {
    
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The Number...");
		int num1=sc.nextInt();
		System.out.println("Enter The Number ...");
		int num2=sc.nextInt();
		
		int sum=0;
		
		for(int i=num1 ;i<=num2 ;i++)
		{
			int value =i;
			
			boolean check=true;
			
			for(int j=2 ; j<value;j++)
			{
				if(value%j==0)
				{
					check=false;
				}
			}
			
			if(check==true)
			{
				sum=sum+value;
			}
			
		}
		
		System.out.println("Sum of prime numbers Given range "+num1+" to "+num2+" is "+sum);
}
}