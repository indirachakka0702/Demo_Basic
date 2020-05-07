package Practice.java;

public class PolymorphismMethodOverLoading {

	public static void main(String[] args) 
	{
		X obj=new X();
		obj.show(5.5);

	}

}
   class X              //Method Overloading,Early Binding,Compile Time Polymorphism
{
	 public void show()
	 {
		 System.out.println("Hello");
	 }
	 public void show(int i)
	 {
		 System.out.println("Hello "+i);
	 }
	 public void show(double d)
	 {
		 System.out.println("Hello "+d);
	 }
}