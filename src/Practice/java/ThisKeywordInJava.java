package Practice.java;

public class ThisKeywordInJava {

	public static void main(String[] args) 
	{
	    O obj=new O(6);
	    obj.show();

	}

}
class O
{
	private int x;         //Instance variable
	 public O(int x)       // local  variable
	 {
		 this.x=x;         // current instance
	 }
	public void show()
	{
		System.out.println("x is"+x);
	}
}
