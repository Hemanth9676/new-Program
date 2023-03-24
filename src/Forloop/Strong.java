package Forloop;

import java.util.Scanner;

public class Strong {

	public static void main(String[] args) {
      Scanner scn=new Scanner(System.in);
      System.out.println("Enter a number");
      int num=scn.nextInt();
      
      int temp=num;
      int sum=0;
      while(num>0)
      {
    	  int fact=1;  //if i declare fact varible out side the loop it will store the factorial of a each character in the next iteraton i value will be multiplayed with fact since the fact is 120 it is not possible
    	  int rem=num%10;
    	  for(int i=1;i<=rem;i++)
    	  {
    		 fact=fact*i;
    		 
    	  }
    	  sum=sum+fact;
    	  num/=10;
      }
      if(sum==temp)
      {
    	  System.out.println("Strong");
      }
      else
    	  System.out.println("Not Strong");
	}

}
