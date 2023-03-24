  package Arrayrs23;

import java.util.Scanner;

public class Palindromenum {

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
    for(int i=0;i<a.length-1;i++)
    {
    	int n=a[i];
    	int copy=n;
    	int rev=0;
    	while(n>0)
    	{
    		rev=rev*10+n%10;
    		n/=10;
    	}
    
    	if(copy==rev)
    	{
    		System.out.println(copy+"is a pallindrome");
    	}
    	else
    	{
    		System.out.println(copy+"is not pallindrome");
    	}
    }
	}

}
