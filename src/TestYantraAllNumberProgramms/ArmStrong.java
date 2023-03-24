package TestYantraAllNumberProgramms;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    System.out.println("Enter a Number");
    int n=scn.nextInt();
    int temp=n;
    int count=0;
    while(n>0)
    {
    	n/=10;
    	count++;
    }
    n=temp;
    int sum=0;
    while(n>0)
    {
    	int rem=n%10;
    	int fact=1;
    	for(int i=1;i<=count;i++)
    	{
    		fact*=rem;
    	}
    	sum+=fact;
    	n/=10;
    }
	
	if(sum==temp)
	{
		System.out.println("Armstrong Number");
	}
	else
	{
		System.out.println("Not Armstrong");
	}

}
}
