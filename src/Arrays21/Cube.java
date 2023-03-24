package Arrays21;

public class Cube {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};


		int cube=0;
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=a.length-1;j++)
			{
			cube=a[i]*a[i]*a[i];
		}
		System.out.println(cube);
		}
	} 

}
