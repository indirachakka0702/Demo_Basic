package Practice.java;

public class SuperKeywordAsAnObject {

	public static void main(String[] args)
	{
		I obj=new I();
		obj.abc();

	}

}
class K
{
	//int i=5;
	public void abc()
	{
		System.out.println("K abc");
	}
}
class I extends K
{
	public void abc()
	{
		super.abc();
		System.out.println("I abc");
	}
	/*int i=4;
	public void show()
	{
		//System.out.println(i);
		System.out.println(super.i);
	}*/
}