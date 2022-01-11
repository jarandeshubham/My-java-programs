package assignment1;

import java.util.Scanner;

public class employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc= new Scanner(System.in);
     int emp_id, emp_salary,emp_pf;
     String emp_name,emp_profile;
     
     System.out.println("enter employee name:");
     emp_name=sc.next();
     System.out.println("emloyee name is:"+emp_name);

     
     System.out.println("enter employee profile:");
     emp_profile=sc.next();
     System.out.println("employee profile is :"+emp_profile);

     
     System.out.println("enter employee id:");
     emp_id=sc.nextInt();
     System.out.println("employee id:"+emp_id);

     
     System.out.println("enter employee pf:");
     emp_pf=sc.nextInt();
     System.out.println("employee pf:"+emp_pf);

     int basic;
     System.out.println("enter employee salary:");
     basic=sc.nextInt();
     int salary= emp_pf+basic;
     System.out.println("employee total salary is:"+salary);

     

     

	}

}
