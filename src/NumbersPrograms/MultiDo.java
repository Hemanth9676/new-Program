package NumbersPrograms;

import java.util.Scanner;

public class MultiDo {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=scn.nextInt();
          int i=1;
          do
          {
        	  System.out.println(n+"*"+i+"="+(n*i));
        	  i++;
          }while(i<=10);
	}

}
