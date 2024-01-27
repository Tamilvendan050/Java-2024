package org.emp;

public class empdetails {
	
	public void empname () {
		System.out.println("Employee name is TAMILVENDAN");
	}
	
	public void empid () {
		System.out.println("Employee ID is 50");
	}
	
	public void empstatus() {
		System.out.println("Employee Tamilvendan is Senoir in office");
	}
	
	public void empnumber() {
		System.out.println("Employee phone number is 9080468396");
	}
	
	public static void main(String[] args) {
		
		empdetails e =new empdetails ();
		e.empname();
		e.empid();
		e.empstatus();
		e.empnumber();
		

}
}