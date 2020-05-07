package AssignmentsOwnPractice;

import java.util.Scanner;

public class FindingSmallestAndLargestNumberOfAnArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	       System.out.println("Enter the length of an Array: ");
	       int length=sc.nextInt();
	       int a[]=new int [length];
	      
	       for(int i=0;i<a.length;i++)
	       {
	    		   System.out.println("Enter the input elements of an array is: ");
	    		     a[i]=sc.nextInt();

	       }
	      
	       int largest=a[0];
	       for(int i=0;i<length;i++)
	       {
              if(largest<a[i])
              {
            	  largest=a[i];
              }
	       }
             System.out.println("Largest element of given array is: "+largest);
             
             int smallest=a[0];
             for(int i=0;i<length;i++)
             {
            	 if(smallest>a[i])
            	 {
            		 smallest=a[i];
            	 }
             }
             sc.close();
             System.out.println("Smallest element of given array is: "+smallest);
	}

}
