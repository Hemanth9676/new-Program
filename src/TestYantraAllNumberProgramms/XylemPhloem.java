package TestYantraAllNumberProgramms;

public class XylemPhloem {

	public static void main(String[] args) {
    int n=12337;
    int sumrest=0;
    int sumf1=n%10;
    n/=10;
    while(n>9)
    {
    	sumrest+=n%10;
    	n/=10;
    }
    sumf1+=n;
    if(sumf1==sumrest)
    {
    	System.out.println("Xylem");
    }
    else
    {
    	System.out.println("Phloem");
    }
	}

}
