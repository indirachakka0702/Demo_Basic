package Practice.java;

public class SuperKeywordinMethod {

	public static void main(String[] args) 
	{
		H obj=new H(5);
	}

}
class D extends Object                //super class
{
	public D()
	{
		super();
		System.out.println("In cons D");
	}
	public D(int i)
	{
		System.out.println("In cons D para");
	}
}
class H extends D                  //  sub class
{
	public H()
	{
		super();
		System.out.println("In cons H");
	}
	public H(int i)
	{
		super(i); 
		System.out.println("In cons H para");
	}
}