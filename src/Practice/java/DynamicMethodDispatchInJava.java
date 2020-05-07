package Practice.java;

public class DynamicMethodDispatchInJava {

	public static void main(String[] args) 
	{
		V obj1=new V();
		U obj2=new U();
		V a;
		a=obj2;   //a=obj1;   if a denotes V doesn't matter, if we addressing a=obj2 then it prints show method in U
		a.show(); //if we addressing a=obj1 then it calls show method in V
	   	

	}

}
class V
{
	public void show()
	{
		System.out.println("In show V");
	}
}
class U extends V
{
	public void show()
	{
		System.out.println("In show U");
	}
}
