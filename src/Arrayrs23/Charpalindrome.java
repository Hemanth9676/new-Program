package Arrayrs23;

public class Charpalindrome {
     //character pallindrome
		public static void main(String[] args) {
			char[] a= {'M','A','L','A','Y','A','L','A','M'};
			int i=0,j=a.length-1;
			boolean flag=true;
			while(i<j) {
				
				if(a[i]!=a[j]) 
					{
					flag=false;
					}
				i++;
				j--;
				
			}
			if(flag==false) System.out.println("not palindrome");
			else System.out.println("Palindrome");
		}
	}
