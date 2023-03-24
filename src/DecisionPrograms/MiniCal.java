package DecisionPrograms;

import java.util.Scanner;

public class MiniCal {

	public static void main(String[] args) {
          Scanner scn=new Scanner(System.in);
          System.out.println("Enter Number");
          int num1=scn.nextInt();
          System.out.println("Enter a Operator");
          char c=scn.next().charAt(0);
          System.out.println("Enter a Number");
          int num2=scn.nextInt();
          
          
          switch (c)
          {
          case '+':
        	  System.out.println(num1+"+"+num2+"="+(num1+num2));
        	  break;
          case '-':
        	  System.out.println(num1+"-"+num2+"="+(num1-num2));
        	  break;
          case '*':
        	  System.out.println(num1+"*"+num2+"="+(num1*num2));
        	  break;
          case '/':
        	  System.out.println(num1+"/"+num2+"="+(num1/num2));
        	  break;
          case '%':
        	  System.out.println(num1+"%"+num2+"="+(num1%num2));
        	  break;
        	  
          }
	}

}
