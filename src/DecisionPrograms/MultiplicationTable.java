package DecisionPrograms;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter a Number");
        int num=scn.nextInt();
        int i=1;
        do
        {
        	System.out.println(num+"*"+i+"="+(num*i));
        	i++;
        }while(i<=10);
        
      
	}

}
