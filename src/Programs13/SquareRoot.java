 package Programs13;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
     Scanner scn=new Scanner(System.in);
     System.out.println("Enter a number");
      int num=scn.nextInt();
      for(int i=1;i<=num;i++)
      {
//    	  prod=prod*i;
    	  if(i*i==num) {
    		  System.out.println("It is a Square"+i);
    		  break;
    	  }else
    	  {
    		  System.out.println("Not a square"+i);
    	  }
      }
	}

}
