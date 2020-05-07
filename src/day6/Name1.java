package day6;

import java.util.Scanner;

public class Name1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the employee Name:    ");
	String empName=sc.next();
	empName=empName.toUpperCase();
	 sc.close();
		switch (empName) {
		case "JOHN":System.out.println("Name: John,empID 1: Profile:CEO");
			break;
		case "RICKY": System.out.println("Name: Ricky,empID 2: Profile: MD");
		   break;
		case "TOM": System.out.println("Name: Tom,empID 3: Profile: HR");
		   break;
		case "ABHI": System.out.println("Name: Abhi,empID 1001: Profile: QA Director");
		   break;
		case "AKSHAY": System.out.println("Name: Akshay,empID 2001: Profile: QA Manager");
		   break;
		case "VINOD": System.out.println("Name: Vinod,empID 5000: Profile: Developer");
		  break;
		default: System.out.println("Sorry !! no employee exist with the entered empID");
			
		}

	}

	
	}


