package Practice.java;

public class PolymorphismMethodOverriding {

	public static void main(String[] args) {
		Q obj=new Q();
		obj.show();
				

	}

}
class P           // Method Overriding,Late Binding,Dynamic Binding,Runtime Polymorphism 
{
	public void show()
	{
		System.out.println("In show A");
	}
}
class Q extends P
{
	public void show()
	{
		System.out.println("In show B");
	}
}
