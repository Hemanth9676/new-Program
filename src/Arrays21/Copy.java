package Arrays21;

import java.util.Scanner;

public class Copy {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a values");
      int[] a=new int[5];
     
      for(int i=0;i<a.length;i++)
      {
    	  a[i]=scn.nextInt();
      }
      int[] b=a;
      for(int i=0;i<=b.length-1;i++)
      {
      System.out.println(b[i]);
      }
	}

}
