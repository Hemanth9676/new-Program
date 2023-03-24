package Methods18;

public class GretestOfThree {
	public static void gretest()
	{
		int a=10;
		int b=20;
		int c=30;
		String s=a>b?(a>c?"a is gretest":"c is gretest"):(b>c?"b is gretest":"c is gretest");
		System.out.println(s);
		
		
	}

	public static void main(String[] args) {
		gretest();
	}

}
