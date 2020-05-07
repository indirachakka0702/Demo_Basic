package Practice.java;

public class VarargsVariableArguments {

	public static void main(String[] args) {
		Display obj=new Display();
		obj.show(5,6,7,8); //if user enter one variable call show(int a) method
                           //if user enter multiple values it call show(int ...a)
		
	}

}
class Display
{
	public void show(int ...a)   //Varaargs-Variable Argumens(if we don't know how many 
	{                               // parameters user entering then use ...a
		for(int i: a)
		{
		System.out.println(i);
		}
	}
	public void show(int a)
	{
		System.out.println(a +" in show a");
		
	}   
}
