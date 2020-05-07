package Practice.java;

public class InheritanceDemo {

	public static void main(String[] args)
	{
		//Add obj=new Add();
		AddSubMul obj=new AddSubMul();
		obj.num1=5;
		obj.num2=6;
		obj.sum();
        System.out.println(obj.result);
        obj.sub();
        System.out.println(obj.result);
        obj.mul();
        System.out.println(obj.result);
	}

}
class Add              // Parent,Super,Base
{
	int num1,num2,result=0;
	public void sum()
	{
		result=num1+num2;
	}
}
// Child,Sub,Derived
class AddSub extends Add     //single-level Inheritance
{
	public void sub()
	{
		result=num1-num2;
	}
}
class AddSubMul extends AddSub    //Multi-level Inheritance
{
	public void mul()
	{
		result=num1*num2;
	}
}
/*class Div
{
	
}
class Calc extends Add,Div     // Multiple-level inheritance but java don't supports that why we are getting errors
{
	
}   */












