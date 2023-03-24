package Methods18;

public class polygon {
	public static void areaOfRectangle(int len,int bre)
	{
		int rem=len*bre;
		System.out.println(rem);
	}
	public static void areaOfSquare(int side)
	{
		int rem=side*side;
		System.out.println(rem);
	}
	public static void areaOfCircle(double d)
	{
		double rem=3.14*(d*d);
		System.out.println(rem);
	}
	public static void areaOfTriangle(int n1,int n2)
	{
		       int rem=(1/2)*(n1*n2);
		       System.out.println(rem);
	}

	public static void main(String[] args) {
		areaOfRectangle(10,20);
		areaOfSquare(10);
		areaOfCircle(10.01);
		areaOfTriangle(10,20);
		
	}

}
