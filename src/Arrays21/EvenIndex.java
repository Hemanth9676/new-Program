package Arrays21;

import java.util.Scanner;

public class EvenIndex {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a Size");
		int size=scn.nextInt();
		int [] a=new int[size];
		System.out.println("Enter a values");
		int sum=0;
		for(int i=0;i<size;i++)
		{
			a[i]=scn.nextInt();
		}
		
		for(int i=0;i<=a.length-1;i++)
		{
			if(i%2==0)
			{
				sum=sum+a[i];
				System.out.println(a[i]);
				System.out.println(sum);
			}
		}
	}

}
