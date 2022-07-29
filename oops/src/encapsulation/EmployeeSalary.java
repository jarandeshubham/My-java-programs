package encapsulation;

public class EmployeeSalary {

	private int salary;
	
	public void setsalary(int sal)
	{
		if(sal>0)
		{
			salary=sal;
		}
		else
		{
			salary=0;
		}
	}
	
	public int getsalary()
	{
		return salary;
	}
}
