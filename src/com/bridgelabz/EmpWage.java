package com.bridgelabz;

public class EmpWage {
	 public static final int IS_PRESENT = 1;
	 public static final int SALARY_PER_HR = 20;   
	public static void employeeAttendace() {
		double empCheck = Math.floor((Math.random() * 10) % 2);
		int working_hr=0;
		if (empCheck == IS_PRESENT) {
			System.out.println("Employee is Present");
			working_hr=8;
			double Salary = working_hr * SALARY_PER_HR;

	        System.out.println("Employee Salary is = " + Salary + " rs.");
		} else {
			System.out.println("Employee is Absent");
		}
	}

	public static void main(String[] args) {
		EmpWage.employeeAttendace(); // main method
	}
}
