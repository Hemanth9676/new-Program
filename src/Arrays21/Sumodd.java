package Arrays21;

public class Sumodd {
	public static void main(String[] args) {
		int sum=0;
		int[] a= {1,3,5,6,7,8,9};
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]%2!=0)
			{
				sum=sum+a[i];
			}
		}
		System.out.println(sum);
	}
}