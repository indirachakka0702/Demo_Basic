package Practice.java;

public class Encapsulation 
{  
	public static void main(String[] args) 
	{
		Emp e1=new Emp();
		e1.setEmpId(3);
		e1.setEmpName("Indu");
		Emp e2=new Emp();
		e2.setEmpId(5);
		e2.setEmpName("Priya");
	
		System.out.println(e1.getEmpName()+e1.getEmpId());
		System.out.println(e2.getEmpName()+e2.getEmpId());
	}
	
	}
class Emp
{
	private int empId;
	private String empName;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
}

