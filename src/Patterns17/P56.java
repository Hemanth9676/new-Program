package Patterns17;



public class P56 {

	public static void main(String[] args) {
		
        int num=5;
        int count=1;
        for(int r=1;r<=num;r++) {
        	for(int i=1;i<=num-r;i++) {
        		System.out.print(" ");
        	}
        	for(int j=1;j<=2*r-1;j++) {
        		if(j%2==0)
        		System.out.print("0");
        		else System.out.print("1");
        	}
        	System.out.println();
        }
	}

}
