package Arrays21;

import java.util.Scanner;

public class Even {

	public static void main(String[] args) {
		 Scanner scn=new Scanner(System.in);
		    System.out.println("Enter a size");
		    int size=scn.nextInt();
		    int [] a=new int[size];
		    System.out.println("Enter the array elements");
		    for(int i=0;i<size;i++)
		    {
		    	a[i]=scn.nextInt();
		    }
     for(int i=0;i<=a.length-1;i++)
     {
    	 if(a[i]%2==0)
    	 {
    		 System.out.println(a[i]+" even");
    	 }
    	 else
    	 {
    		 System.out.println(a[i]+"odd");
    	 }
     }
     
	}

}
