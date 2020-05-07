package day6;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the empID:    ");
		int empID=sc.nextInt();
		sc.close();
		switch (empID) {
		case 1:System.out.println("Name: John, Profile:CEO");
			break;
		case 2: System.out.println("Name: Ricky, Profile: MD");
		   break;
		case 3: System.out.println("Name: Tom, Profile: HR");
		   break;
		case 1001: System.out.println("Name: Abhi, Profile: QA Director");
		   break;
		case 2001: System.out.println("Name: Akshay, Profile: QA Manager");
		   break;
		case 5000: System.out.println("Name: Vinod, Profile: Developer");
		  break;
		default: System.out.println("Sorry !! no employee exist with the entered empID");
			
		}

	}

}
