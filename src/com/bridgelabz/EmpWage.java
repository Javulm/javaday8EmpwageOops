package com.bridgelabz;

public class EmpWage {
final static int IS_PRESENT=1;
final static int IS_ABSENT=0;
public final static int  IS_PART_TIME=2;
public static String companyName;
public static int maxWorkingDays;
public static int maxWorkingHrs;
public static double check = Math.floor((Math.random() * 10) % 3);
public static double check2;
public static String getCompanyName() {
	return companyName;
}

public static void setCompanyName(String companyName) {
	EmpWage.companyName = companyName;
}
public static void mulCompany(String companyName, int wagePerHr, int maxWorkingDays, int maxWorkingHrs) {
	System.out.println("Details of " + companyName + " employee");
    System.out.println("-----------------------------------------------------");
    System.err.println("Wage per hour:" + wagePerHr);
    System.out.println("Maximum working days:" + maxWorkingDays);
    System.out.println("Maximum working hours:" + maxWorkingHrs);
    System.out.printf("%5s     %5s     %5s     %5s\n", "Day", "Workinghrs", "Wage", "Total working hrs");
	DayWage.attendanceCheck(); // static method accessed using class name
	DayWage part = new DayWage();
	part.partTimeCheck(); // accessed by creating object
	part.wage();
	TotalWage obj2 = new TotalWage();
	obj2.wage1();
}

	public static void main(String[] args) {
	System.out.println("Welcome to employee wage computation.");
	mulCompany("Wipro", 30, 30, 200);
    mulCompany("TCS", 40, 25, 100);
    mulCompany("Reliance", 25, 30, 150);
	}
}
