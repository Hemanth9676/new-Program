package Arrays21;

import java.util.Scanner;

public class ReverseofArray {

	public static void main(String[] args) {
		int j=0;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a values");
		int[] a=new int[5];

		for(int i=0;i<a.length;i++)
		{
			a[i]=scn.nextInt();
		}
		for(int i=a.length-1;i>=0;i--)
		{

			System.out.println(a[i]);
		}
	}

}
