  package Arrayrs23;

public class Pairessum {

	public static void main(String[] args) {
		int[] a= {7,4,6,5,5,3,9};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==10)
					System.out.println(a[i]+" + "+a[j]+" = 10");
			}
		}
	}
}