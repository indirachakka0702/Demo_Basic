package day3;

public class Var1 {
	static int abc=20;    // instance/global variable(static variable)
	    int xyz=50;       // instance/global variable      (non-static variable)
	
	  void test ()     // test method(non-static method)
	{
		int d=30; // local variable
		System.out.println("line:10- i am member of test method= "+d);
		System.out.println("line:11- i am member of test method= "+abc);
		System.out.println("line:12- iam member of test method= "+xyz);
	}

	public static void main(String[] args)       // main method(static method) 
	{    Var1 b1=new Var1 ();    // create the object 
       int a=10;  // local variable
       int b=20;  // local variable
       int c=a+b;  // local variable
       System.out.println("line:20 "+"Addition of a= "+a+" and b= "+b+" is "+c);
       //test();     // calling way for the test method
         System.out.println("line:22 "+abc);
         b1.test();
         System.out.println("line:24 "+b1.xyz);
	}

}
