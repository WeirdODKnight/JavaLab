package com.craft.knowledges.oopsencapsulation;

class AccessModifier2 {

	int empId = 240;
	public String empName = "ABDUL";
	private int empAge;

	void setAge(int i) {
		empAge = i;
	}

	int getAge() {
		return empAge;
	}
}

public class AccessModifier1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AccessModifier2 am1 = new AccessModifier2();
		System.out.println(am1.empId);
		System.out.println(am1.empName);
//		System.out.println(am1.empAge); // ←---------- Error can acess only through method (empage is not visible)
		am1.setAge(25);
		System.out.println(am1.getAge());
		try {
			System.out.println(10/2);
		}catch(Exception e){
			System.out.println("Divison by zero is illegal");
		}
		
		
	}
}