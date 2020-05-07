package day9;

 class Parent2 {

	  void Window95()
	  {
		  System.out.println("Running Win95 method..");
	  }
 }
	  public class MethodOverride1 extends Parent2{
		  void Windoe95()
		  {
			  System.out.println("Running Win98 method..");
		  }
	  
	public static void main(String[] args) {
		Parent2 p1=new Parent2();
		p1.Window95();
		MethodOverride1 c1=new MethodOverride1();
		c1.Window95();
		Parent2 p3=new MethodOverride1 ();
		p3.Window95();

	}

}
 
 
