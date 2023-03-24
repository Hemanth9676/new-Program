package LoopingStatements;

import java.util.Scanner;

public class FirstEven10 {

	public static void main(String[] args) {
          int num=1;
          int sum=0;
          int count=0;
          
          while(num<=10)
          {
        	  if(num%2==0)
        	  {
        		  count++;
        		  sum=sum+num;
        		  System.out.println(num);
        		  System.out.println("***************");
        	  }
        	  num++;
          }
          System.out.println("The sum of even numbers is"+ sum);
        
	}

}
