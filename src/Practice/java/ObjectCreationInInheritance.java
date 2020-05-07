package Practice.java;

public class ObjectCreationInInheritance {

	public static void main(String[] args) 
	{
		//B obj=new B(5);         // it will call default constructor public A(); public B(int i)
		// A obj=new A(); 
		//A obj=new A(5);
         A obj=new B();       // you can call class of parent classA & object of child class B
	}

}
class A
{
	public A()
	{
		System.out.println("In A Constructor");
	}
	public A(int i)
	{
		System.out.println("IN A Constructor Int");
	}
}
class B extends A
{
	public B()
	{
		System.out.println("In B constructor");
	}
	public B(int i)
	{
		System.out.println("In B constructor Int");
	}
}
