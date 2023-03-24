package Arrays21;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoArray {
//Merging the to ar
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the size of array");
		int size=sc.nextInt();
		int arr1[]=new int[size];
		System.out.println("Enetr the 1st array elements");
		for (int i = 0; i < arr1.length; i++) 
		{
			arr1[i]=sc.nextInt();
		}

		System.out.println("Enetr the size of 2nd array");
		int size2=sc.nextInt();
		int arr2[]=new int[size2];
		System.out.println("Enetr the 2nd array elements");
		for (int i = 0; i < arr2.length; i++) 
		{
			arr2[i]=sc.nextInt();
		}

		int[] arr3=new int[arr1.length+arr2.length];
		int ind=0;

		for (int i = 0; i < arr3.length; i++) 
		{
			if(i<arr1.length)

				arr3[i]=arr1[i];

			else
			{	
				arr3[i]=arr2[ind];
				ind++;
			}	
		}

		System.out.println(Arrays.toString(arr3));

	}

}



//int[] a1= {10,30,50,70,90};
//int[] a2= {20,40,60,80};
//int[] a3=new int[a1.length+a2.length];
//int k=0;
//for(int i=0;i<a3.length;i++)
//{
//	if(i<a1.length)
//		a3[i]=a1[i];
//	else
//	{
//		a3[i]=a2[k];
//		k++;
//	}
//}
//for(int i=0;i<a3.length;i++)
//{
//	System.out.println(a3[i]);
//}
//}
//
//}
//
