package encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		
		EmployeeSalary employeeSalary=new EmployeeSalary();
		
		employeeSalary.setsalary(4000);
		System.out.println("employee salary is: "+employeeSalary.getsalary());

	}

}
