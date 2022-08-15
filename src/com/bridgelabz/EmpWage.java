package com.bridgelabz;

public class EmpWage {
static final int IS_PRESENT = 0 ;
final static int IS_ABSENT = 0
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int SALARY_PER_HR = 20;
	public static final int NO_OF_DAYS = 20;
	public static final int MAX_HR_IN_MONTH = 100;
	public static double check = Math.floor((Math.random() * 10) % 3);
	public static double check2
	public static final int NO_OF_DAYS = 20;
	public static void employeeAttendace() {
		int working_hr = 0;
		int employeewage = 0;
		int Totalempwage = 0;
		for (int day = 0; day < NO_OF_DAYS; day++) {
			double empCheck = Math.floor((Math.random() * 10) % 3);
			switch ((int) empCheck) {
			case IS_FULL_TIME:
				System.out.println("Employee is Present");
				working_hr = 8;
				break;
			case IS_PART_TIME:
				System.out.println("Employee is part time Present");
				working_hr = 4;
				break;
			default:
				System.out.println("Employee is Absent");
				working_hr = 0;
			}
			employeewage = working_hr * SALARY_PER_HR;
			Totalempwage += employeewage;
			System.out.println("Employee Wage :  " + employeewage);
		}
		System.out.println("Total Employee Wage : " + Totalempwage);
	}
final static int IS_PRESENT=1;
final static int IS_ABSENT=0;
public final static int  IS_PART_TIME=2;
public static final int SALARY_PER_HR = 20;
protected static final int NO_OF_DAYS = 20;

public static double check = Math.floor((Math.random() * 10) % 3);
public static double check2;

	public static void main(String[] args) {
	System.out.println("Welcome to employee wage computation.");
		DayWage.attendanceCheck(); // static method accessed using class name
		DayWage part = new DayWage();
		part.partTimeCheck(); // accessed by creating object
		DayWage.wage();
		TotalWage obj2 = new TotalWage();
		obj2.wage1();
		EmpWage.employeeAttendace(); // main method
		System.out.println("Welcome to employee wage computation.");
		DayWage.attendanceCheck(); // static method accessed using class name
		DayWage part=new DayWage();
		part.partTimeCheck(); // accessed by creating object
		DayWage.wage();
		TotalWage obj2= new TotalWage();
		obj2.wage1();
	}
}
