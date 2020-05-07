package Practice.java;
// Abstract class and Abstract method
public class AbstractDemo {

	public static void main(String[] args) 
	{
		//Maheshphone obj=new Maheshphone();// can not instantiate abstract class
		//obj.call();
        Sureshphone obj=new Sureshphone();
        obj.call();
        obj.move();
        obj.dance();
        obj.cook();
	}

}
abstract class Maheshphone
{
	public void call()
	{
		System.out.println("calling...");
	}
    public abstract void move();
    public abstract void dance();
    public abstract void cook();
}
abstract class Rameshphone extends Maheshphone
{
	public void move()
	{
		System.out.println("Moving...");
	}
}
class Sureshphone extends Rameshphone
{
	public void dance()
	{
		System.out.println("Dancing...");
	}
	public void cook()
	{
		System.out.println("Cooking...");
	}
}