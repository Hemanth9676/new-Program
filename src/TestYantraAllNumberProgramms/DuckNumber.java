package TestYantraAllNumberProgramms;

import java.util.Scanner;

public class DuckNumber {

	public static void main(String[] args) {
		int r;
        boolean flag=false;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number");
       int n = sc.nextInt();
//       int num = n;
        while (n > 0)
        {
            r = n % 10;
            if(r==0)
            {
                flag=true;
//                break;
            }
            n = n / 10;
        }
        if(flag)
        {
            System.out.println("Duck Number");
        }
        else
        {
            System.out.println("Not Duck Number");
        }
        
    }
}
	
