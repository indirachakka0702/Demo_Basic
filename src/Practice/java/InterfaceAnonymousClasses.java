package Practice.java;

interface PQR
{
	void show();    //by default it is public abstract void method
}
public class InterfaceAnonymousClasses {

	public static void main(String[] args)
	{
		PQR obj=new PQR()                 // instantiation of method to declaration of an object is Ananymous classes
				{
			      public void show()
			      {
			    	  System.out.println("in show");
			      }
				};
		obj.show();

	}

}
