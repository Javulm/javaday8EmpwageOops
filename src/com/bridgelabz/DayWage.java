package com.bridgelabz;

class DayWage extends EmpWage {
	public static final int SALARY_PER_HR = 20;
	static int working_hr;
	static double salary;
	static void attendanceCheck() {
		switch ((int) check) {
		case IS_PRESENT:
			System.out.println("employee is present.");
			break;
		case IS_ABSENT:
			System.out.println("employee is absent.");
		}
	}

	void partTimeCheck() {
		if(check==IS_PART_TIME) {
			System.out.println("employee is part time present.");
		}
	}
	static void wage() {
		check2 = Math.floor((Math.random() * 10) % 3);
		if (EmpWage.check2 == EmpWage.IS_PRESENT) {
			working_hr = 8;
		} else if (EmpWage.check2 == EmpWage.IS_PART_TIME) {
			working_hr = 4;
		} else {
			working_hr = 0;
		}
		salary = working_hr * SALARY_PER_HR;
		System.out.println("One day Employee salary is: " + salary + "Rs");
	}
}
