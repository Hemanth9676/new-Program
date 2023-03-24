package NumbersPrograms;

import java.util.Scanner;

public class Polindrome {

	public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=scn.nextInt();
        
        int temp=num;
        int rev=0;
        while(num!=0)
        {
        	rev=(rev*10)+num%10;
        	num/=10;
        } 
        if(temp==rev)
        {
        	System.out.println("Palindrome");
        }
        else
        {
        	System.out.println("Not a Palindrome");
        }
	}

}
