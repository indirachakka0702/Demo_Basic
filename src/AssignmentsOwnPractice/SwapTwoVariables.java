package AssignmentsOwnPractice;

import java.util.Scanner;

public class SwapTwoVariables {

	public static void main(String[] args) {		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the First Number A= ");
		int a=sc.nextInt();
		System.out.println("Enter the Second Number B= ");
		int b=sc.nextInt();
		sc.close();
		a=a+b; //if a=5,b=4 ; a=a+b; a=5+4=9
		b=a-b; //b=9-4=5
		a=a-b; //a=9-5=4
		System.out.println("a : "+a);
		System.out.println("b : "+b);

	}

}
