package com.bridgelabz;

public class EmpWage {
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
	}
}
