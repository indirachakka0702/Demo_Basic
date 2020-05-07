package Practice.java;

public class ImportenceofFinalKeyword {
	// Final Variable,Method,Class

	public static void main(String[] args) 
	{
		L obj=new L();
		obj.show();
		//final int i=5;
		//i++;
		//System.out.println(i);

	}

}
final class L
{
	final public void show()
	{
		System.out.println("In L show");
	}
}
/*class G extends L
{
	public void show()
	{
		System.out.println("In G show");
	}
}*/
