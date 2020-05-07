package day8;

import java.util.Scanner;

public class ExplanationFor2DArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Row length of an Array: ");
		int row=sc.nextInt();
		System.out.println("Enter the Column length of an Array: ");
		int column=sc.nextInt();
		int a[][]=new int[row][column];
		System.out.println("Enter all the elements: ");
		sc.close();
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
