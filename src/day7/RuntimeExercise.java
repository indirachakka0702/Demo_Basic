package day7;

import java.util.Scanner;

public class RuntimeExercise {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length= ");
        int length=sc.nextInt();
        System.out.println("Enter the character of pattern:  ");
        char character=sc.next().charAt(0);
        //String character=sc.next();
        sc.close();
        for(int i=1;i<=length;i++)
        {
        	for(int j=1;j<=i;j++)
        	{
        		System.out.print(character);
        	}
        	System.out.println();
        }
	}

}
