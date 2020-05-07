package day5;

import java.util.Scanner;

public class greaterno {

	public static void main(String[] args) 
 {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the First number: ");
    int a=sc.nextInt();
    System.out.println("Enter the Second number: ");
    int b=sc.nextInt();
    if( a>b )
    {
    	System.out.println("a= "+a+"  is greater number than b= "+b);
    }
    else
    {
    	System.out.println("b= "+b+" is greater number than a= "+a);
    }
    sc.close();
    		
	}

}
