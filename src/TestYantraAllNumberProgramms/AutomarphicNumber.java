package TestYantraAllNumberProgramms;

public class AutomarphicNumber {

	public static void main(String[] args) {
     int n=5;
     int sq=n*n;
     boolean flag=true;
     while(n>0)
     {
    	 if(n%10==sq%10)
    	 {
    		 n/=10;
    		 sq/=10;
    	 }
    	 else
    	 {
    		 flag=false;
    		 break;
    	 }
     }
     if(flag)
     {
    	 System.out.println("Automarphic");
     }
     else
     {
    	 System.out.println("Not Automarphic");
     }
	}

}
