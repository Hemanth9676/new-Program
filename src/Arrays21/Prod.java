package Arrays21;

public class Prod {
//	static int prod=1;
	 static int fact=1;
	public static void main(String[] args) {
		int[] a=new int[5];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		for(int i=0;i<=a.length-1;i++)
		{
//			prod=prod*a[i];
			fact=fact*a[i];
		}
		System.out.println(fact);//prod

	}

}
