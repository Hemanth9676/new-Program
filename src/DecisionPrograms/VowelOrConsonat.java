package DecisionPrograms;

import java.util.Scanner;

public class VowelOrConsonat {

	public static void main(String[] args) {
      Scanner scn=new Scanner(System.in);
      System.out.println("Enter a num");
      char c=scn.next().charAt(0);
		
		if(c == 'a'||c=='e'||c=='i'||c=='o'||c=='u') {
			System.out.println("vowels");
		}
		
		else if (c>='0' && c<='9'){
			System.out.println("numbers");
		}
		else
		{
			System.out.println("Consonats");
		}
	
    	  
      }
    
	}


