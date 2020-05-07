package Practice.java;

public class AbstractDemo2 {

	public static void main(String[] args)
	{
		Iphone obj=new Iphone();
		Samsung obj1=new Samsung();
		show(obj1);
	}
	public static void show(Phone obj)
	{
		obj.showconfig();
	}
}
abstract class Phone
{
	public abstract void showconfig();
}
class Iphone extends Phone
{
	public void showconfig()
	{
		System.out.println("2gb,IOS,9.3");
	}
}
class Samsung extends Phone
{
	public void showconfig()
	{
		System.out.println("2gb,Lolipop");
	}
}