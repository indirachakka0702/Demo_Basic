package day9;

public class Cons1 {

	    Cons1()
	    {
	    	System.out.println("Constructor1 is running..");
	    	
	    }
	    Cons1(int a)
	    {
	    	System.out.println("Constructor2 is running");
	    }
	public static void main(String[] args) {
		Cons1 n1=new Cons1();
		Cons1 n2=new Cons1(10);

	}

}
