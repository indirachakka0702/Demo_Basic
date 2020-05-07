package AssignmentsOwnPractice;

import java.util.Scanner;

 class SquarerootOfaGivenNumber {

	 public static double squareroot(int number) {
		 double temp;
		 double squareroot=number/2;
		 
		 do {
			 
			 temp=squareroot;
			 squareroot=(temp+(number/temp)) /2;
			 
		 }   while((temp-squareroot) !=0);
		 return squareroot;
	 }
	 
	 public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in);
		 System.out.print("Enter the number: ");
		 int num=sc.nextInt();
		 sc.close();
		 
		 System.out.println("Squareroot of "+num+" is: "+squareroot(num));
	}
	
		

	}


