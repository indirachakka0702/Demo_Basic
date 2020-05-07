package Practice.java;
	
interface Abc
{
	void show();    // by default it is public abstract void method so no need to mention that
}
class AbcImpl implements Abc
{
	public void show()
	{
		System.out.println("in show");
	}
}
public class InterfaceDemo {
	
	public static void main(String[] args) 
	{
		Abc obj=new AbcImpl();
		obj.show();
		
	}

}
