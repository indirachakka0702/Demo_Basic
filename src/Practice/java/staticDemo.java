package Practice.java;

public class staticDemo {

	/*static 
	{
		System.out.println("Hello World in static");
	}
	public static void main(String[] args)
	{
		System.out.println("In main");
	}
	static
	{
	   System.out.println("Static 2");	
	}    */
	
	
	static String s="";
	static
	{
		s="Hello World";
	}
	public static void main(String[] args) {
		System.out.println("The value for s: "+s);
	}
}
