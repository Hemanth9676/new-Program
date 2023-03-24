 package Programs13;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("enter a num");
	int n=scn.nextInt();
	int temp,count=0;temp=n;
	while(n>0)
	{
		n/=10;
		count++;
	}
	n=temp;
	int sum=0;
	while(n>0)
	{
		int fact=1;
		int  rem=n%10;
		for(int i=1;i<=count;i++)
		{
			fact=fact*rem;

		}
		sum+=fact;
		n/=10;
	}
	if(temp==sum)
	{
		System.out.println("ArmStrong");
	}
	else
	{
		System.out.println("not armstrong");
	}
}

}
