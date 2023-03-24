package Methods18;

public class Subjects {
            public static void sub()
            {
            int kanada=80;
            int English=85;
            int Hindi=96;
            int Mathes=87;
            int Urdu=89;
            
            int avg=(kanada+English+Hindi+Mathes+Urdu)/5;
            System.out.println(avg+" Average of marks");
            int per=((kanada+English+Hindi+Mathes+Urdu)*100)/500;
            System.out.println(per+" Total percentage");
            
            }
	public static void main(String[] args) {
		sub();
	}

}
