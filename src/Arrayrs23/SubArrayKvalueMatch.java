package Arrayrs23;

public class SubArrayKvalueMatch {

	public static void main(String[] args) {
      int [] nums= {1,1,1};
      int k=2;
    		  int count=0;
      for(int i=0;i<nums.length;i++)
      {
          int sum=0;
          for(int j=i;j<nums.length;j++)
          {
              sum+=nums[j];
              if(sum==k)
              {
                  count++;
              }
          }
      }
//      return count;
      System.out.println(count);
  }
}
	
