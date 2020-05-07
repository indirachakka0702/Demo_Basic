package AssignmentsOwnPractice;

import java.util.Scanner;

public class FindingPositiveNegetiveEveOddZeronumbers {

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	       int a[]=new int [20];
	       
	       for(int i=1;i<20;i++)
	       {
	    		   System.out.println("Enter the input the elements of an array is: "+i);
	    		     a[i]=sc.nextInt(); 
	       }
	       sc.close();
	       
	   int positivecount=0, negetivecount=0,zerocount=0,oddcount=0,evencount=0;
         for(int i=0;i<20;i++)
         {
        	 
        	 if(a[i]>0)
        	 {
        		 positivecount++;
        	 }
        	 else if(a[i]<0)
        	 {
        		 negetivecount++;
        	 }
        	 else
        	 {
        		 zerocount++;
        	 }
        	 if(a[i]/2==0)
        	 {
        		 evencount++;
        	 }
        	 else
        	 {
        		 oddcount++;
        	 }
         }
     
         System.out.println("Total number of positive numbers count is: "+positivecount);
         System.out.println("Total number of negetive numbers count is: "+negetivecount);
         System.out.println("Total number of zero number count is: "+zerocount);
         System.out.println("Total number of even number count is: "+evencount);
         System.out.println("Total number of odd number count is: "+oddcount);
	}

}
