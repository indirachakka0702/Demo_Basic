package AssignmentsOwnPractice;

import java.util.Scanner;

public class MultiplyOfTwoarrys {

	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the Row length of an Array: ");
       int Rows=sc.nextInt();
       System.out.println("Enter the Column length of an Array: ");
       int Columns=sc.nextInt();
       
       int a[][]=new int [Rows][Columns];
       for(int i=0;i<Rows;i++)
       {
    	   for(int j=0;j<Columns;j++)
    	   {
    		   System.out.println("Enter the input for Row number"+i+"and Column number"+j+"of First array is: ");
    		     a[i][j]=sc.nextInt();
    	    	   
    	   }
    	   
       }
       int b[][]=new int [Rows][Columns];
       for(int i=0;i<Rows;i++)
       {
    	   for(int j=0;j<Columns;j++)
    	   {
    		   System.out.println("Enter the input for Row number"+i+"and column number"+j+"of Second array is: ");
    		   b[i][j]=sc.nextInt();
    	   }
       }
       sc.close();
       int c[][]=new int[Rows][Columns];
       System.out.println("Multiply of First and Second Array is: ");
          for(int i=0;i<Rows;i++)
          {
        	  for(int j=0;j<Columns;j++)
        	  {
        		  c[i][j]=a[i][j]*b[i][j];
        		  
        		  System.out.print(c[i][j]+"     ");
        	  }
        	  System.out.println();
          }
     
       }

	} 


