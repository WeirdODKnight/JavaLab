package com.craft.knowledges.pojo;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		  emp1.setEmpid(100);
		  emp1.setEmpname("Hanif");
		  emp1.setEmpsalary(30000.56);
		  
		  Employee  emp2 = new Employee();
		  emp2.setEmpid(200);
		  emp2.setEmpname("Mohammed Iqbal");
		  emp2.setEmpsalary(15000.67);
		  
		  System.out.println(emp1.getEmpid()+" "+emp1.getEmpname()+ " "+emp1.getEmpsalary());
		  System.out.println(emp2.getEmpid()+" "+emp2.getEmpname()+ " "+emp2.getEmpsalary());

}
}