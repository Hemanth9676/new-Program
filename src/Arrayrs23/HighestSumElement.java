package Arrayrs23;

public class HighestSumElement {

	public static void main(String[] args) {
		int[] a = {10,6, 5, 4, 3, 2, 1, 8, 9, 10}; 

		int sum = 0; 

	 
		for (int i = 2; i < a.length; i++) { 
			for (int j = i + 1; j < a.length; j++) { 
				if (a[i] + a[j] >sum) sum = a[i] + a[j];
					 
          }
		}
		System.out.println(sum);
	} 



}