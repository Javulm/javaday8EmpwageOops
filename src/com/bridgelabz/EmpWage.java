package com.bridgelabz;

public class EmpWage {
	 public static final int IS_FULL_TIME = 1;
	 public static final int IS_PART_TIME = 2;
	 public static final int SALARY_PER_HR = 20;
	 public static final int NO_OF_DAYS = 20;
	    public static final int MAX_HR_IN_MONTH = 100;
	public static void employeeAttendace() {
		int working_hr = 0;
	    int totalEmpHrs = 0;
        int totalEmpWorkingDay = 0;

        while (totalEmpHrs <= MAX_HR_IN_MONTH && totalEmpWorkingDay < NO_OF_DAYS) {
            totalEmpWorkingDay++;
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
			  totalEmpHrs += working_hr;
	            System.out.println("Day :  " + totalEmpWorkingDay + "   Emp Hr : " + working_hr);
		}
        int totalEmpWage = totalEmpHrs * SALARY_PER_HR;
		System.out.println("Total Employee Wage : " + totalEmpWage);
	}

	public static void main(String[] args) {
		EmpWage.employeeAttendace(); // main method
	}
}
