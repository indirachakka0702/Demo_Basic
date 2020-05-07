package day9;

import java.util.Arrays;

public class SortingArray {

	public static void main(String[] args) {
		int a[]= {1000,1220,130,440,50};
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.println("a[" +i+ "] =" +a[i]);
		}
	}

}
