package AssignmentsOwnPractice;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
	
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the Number: ");
		 int number=sc.nextInt();
		 sc.close();
		 int count=0;
		 
		 for(int i=2;i<=number/2;i++)
		 {
			 if(number%i==0)
			 {
				 count++;
				 break;
			 }
		
		 }
		 
		 if(count==0 && number !=1)	 
		 
		 {
			System.out.println(number + " is  a Prime Number"); 
		 }
		 else
		 {
			 System.out.println(number + " is a not Prime Number");
		 }

	}

}
