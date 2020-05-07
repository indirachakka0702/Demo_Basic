package Practice.java;

import java.util.Random;

public class Practice {

	public static void main(String[] args) {

     int nums[]=new int[10];
     Random r=new Random();
     for(int i=0;i<10;i++)
     {
    	 nums[i]=r.nextInt(50);
     }
     for(int n: nums)  // for(int i=0;i<nums.length;i++)
     {
    	  System.out.println(n);  // System.out.println(nums[i])
     }
  
	}

}
