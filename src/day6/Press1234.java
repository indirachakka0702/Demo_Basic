package day6;

import java.util.Scanner;

public class Press1234 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First number:  ");
		int a=sc.nextInt();
		System.out.println("Enter the Second number:  ");
		int b=sc.nextInt();
		System.out.println("Press 1: add, Press 2: sub, Press 3: Mul, Press 4: Divi");
		int number=sc.nextInt();
		switch (number) {
		case 1:System.out.println("Addition of First and Second number= "+ (a+b));
		break;
		case 2:System.out.println("Subtraction of First and Second number= "+(a-b));
		break;
		case 3: System.out.println("Multiplication of First and Second number= "+(a*b));
		break;
		case 4:System.out.println("Division of First and Second number= "+(a/b));
        break;
		default:System.out.println("Sorry!! No Result found");
		
		}
		sc.close();
	}

}
