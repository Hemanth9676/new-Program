package Recursion20;

public class P1 {
	public static void Welcome(int count)
	{
		if(count<=0)
		{
			return;
		}
		else
		{
			System.out.println("Welcome TestYantra");
			Welcome(count-1);
		}
	}

	public static void main(String[] args) {
        Welcome(5);
	}

}
