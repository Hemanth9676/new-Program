package Arrays21;

import java.util.Arrays;

public class MergeTwoZigZag {

	public static void main(String[] args) {
		//Merge the two datas in zig zag 
		int[] a1= {10,30,50,70,90};
		int[] a2= {20,40,60,80,100};
		int[] a3=new int[a1.length+a2.length];
		int k=0;
		int j=0;
		for(int i=0;i<a3.length;i++)
		{
			if(j<a1.length) {
				a3[i]=a1[j];
				i++;
				j++;
			}
			if(k<a2.length)
			{
				a3[i]=a2[k];
				k++;
				
			}	
		}
		for(int i=0;i<a3.length;i++)
		{
			System.out.println(a3[i]);
		}
	}

}
