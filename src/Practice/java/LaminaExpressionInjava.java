package Practice.java;

interface OPQ
{
	void show();
}
public class LaminaExpressionInjava {

	public static void main(String[] args)
	{
		OPQ obj=()-> System.out.println("in show");     // LaminaExpression
		obj.show();
	}

}
