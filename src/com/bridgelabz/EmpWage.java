package com.bridgelabz;

public class EmpWage {
	public static void employeeAttendace() {
		int IS_PRESENT = 1;
		double empCheck = Math.floor((Math.random() * 10) % 2);
		if (empCheck == IS_PRESENT) {
			System.out.println("Employee is Present");
		} else {
			System.out.println("Employee is Absent");
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Employee wage computation.");
		EmpWage.employeeAttendace(); // main method
	}
}
