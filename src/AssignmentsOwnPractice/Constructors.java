package AssignmentsOwnPractice;

public class Constructors {

	public static void main(String[] args) {
		
        Abc obj=new Abc( 5.5);   //constructor
	}

}
class Abc
{
	//public Abc()     //this called default constructor
	public Abc(int i)   // this called parameterised constructor
	{
		System.out.println("In Abc Const int");
	}
	public Abc()
	{
		System.out.println("In Abc const");
	}

public Abc(double d)
{
	System.out.println("In Abc const Double");
}
}
