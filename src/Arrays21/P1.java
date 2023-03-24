package Arrays21;

import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a values");
		double d1=scn.nextDouble();
		double d2=scn.nextDouble();
		double d3=scn.nextDouble();
		double d4=scn.nextDouble();
		double d5=scn.nextDouble();
		double sum=0;
		double[] d=new double[5];
		d[0]=d1;
		d[1]=d2;
		d[2]=d3;
		d[3]=d4;
		d[4]=d5;

		for(int i=0;i<=d.length-1;i++)
		{

			System.out.println(d[i]); 
		}
	}

}
