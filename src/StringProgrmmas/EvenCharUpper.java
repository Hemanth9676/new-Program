package StringProgrmmas;

public class EvenCharUpper {

	public static void main(String[] args) {
     String s1="pradeep";
     String temp="";
     s1=s1.toUpperCase();
     
     for(int i=0;i<s1.length();i++)
     {
    	 if(i%2!=0 && s1.charAt(i)!=' ')
    	 {
    		temp+=(char)(s1.charAt(i)+32); 
    	 }
    	 else
    	 {
    		 temp+=s1.charAt(i);
    	 }
     }
     System.out.println(temp);
	}

}
