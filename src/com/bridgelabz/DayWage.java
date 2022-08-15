package com.bridgelabz;

class DayWage extends EmpWage {
	public static int wagePerHr;
	static int working_hr;
	static double salary;
	static int check = (int) (Math.random() * 100) % 3;
	static void attendanceCheck() {
		
		switch ((int) check) {
			case IS_PRESENT :
				System.out.println("employee is present.");
				break;
			case IS_ABSENT :
				System.out.println("employee is absent.");
		}
	}

	void partTimeCheck() {
		if (check == IS_PART_TIME) {
			System.out.println("employee is part time present.");
		}
	}
	void wage() {
		if (check == IS_PRESENT) {
			working_hr = 8;
		} else if (check == IS_PART_TIME) {
			working_hr = 4;
		} else {
			working_hr = 0;
		}
		salary = working_hr * wagePerHr;
//		System.out.println("One day Employee salary is: " + salary + "Rs");
	}
}
