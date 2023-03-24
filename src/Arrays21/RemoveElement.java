package Arrays21;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElement {

	public static void main(String[] args) {
int arr[]= {10,20,30,40,50};
		
		System.out.println("Enter the removing index... ");
		
		int index=2	;
		if(index>=arr.length)
		{
		System.out.println("Array Index Invalid...");
		}
		else
		{
		int [] arr1= new int[arr.length];
		
		int temp=0;
		
		for (int i = 0; i < arr1.length; i++)
		{
	       if(i!=index) 
	       {
			arr1[temp]=arr[i];
			temp++;
	       } 
	      
	    }
		System.out.println("=====Updated array elements are... =====");
		for (int i = 0; i < arr1.length-1; i++) 
		{
			System.out.print(arr1[i]+" ");
		}
	}
}
}