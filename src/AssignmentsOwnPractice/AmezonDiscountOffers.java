package AssignmentsOwnPractice;

import java.util.Scanner;

public class AmezonDiscountOffers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the the amount= ");
		int amount=sc.nextInt();
		sc.close();
		if(amount<=50)
		{  
			System.out.println("Total bill=$ "+amount);
			System.out.println("Amazon giving 2% discount on your next purchase");
	
		}
		else if(amount<=149)
		{
			System.out.println("Total bill=$ "+amount);
			System.out.println("Amazon giving 5% discount on your next purchase");	
		}
		else if(amount<=249)
		{
			System.out.println("Total bill=$ "+amount);
			System.out.println("Amazon giving 10% discount on your next purchase");
		}
		else if(amount<=600)
		{
			System.out.println("Total bill=$ "+amount);
			System.out.println("Amazon giving 15% discount on your next purchase");
		}
		else if(amount<=800)
         {
        	 System.out.println("Total bill=$ "+amount);
        	 System.out.println("Amazon giving 20% discount on your next purchase");
         }
         else 
         {
        	 System.out.println("Total bill=$ "+amount);
        	 System.out.println("Amazon giving 25% discount on your next purchase");
         }
	}

}
