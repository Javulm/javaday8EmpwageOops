package com.bridgelabz;

class attendence{
public final static int IS_PRESENT=1;
public final static int IS_ABSENT=0;
public final static int  IS_PART_TIME=2;
public static final int SALARY_PER_HR = 20;
protected static final int NO_OF_DAYS = 20;

public static double check = Math.floor((Math.random() * 10) % 3);
public static double check2;

static void attendanceCheck() {
	switch ((int) check) {
	case IS_PRESENT:
		System.out.println("employee is present.");
		break;
	case IS_PART_TIME:
		System.out.println("employee is part time present.");
	}
}

void partTimeCheck() {
	if(check==IS_ABSENT) {
		System.out.println("employ is absent.");
	}
}
}
class daywage extends attendence{
	public static final int SALARY_PER_HR = 20;
	static int working_hr;
	static double salary;
	static void wage() {
		check2 = Math.floor((Math.random() * 10) % 3);
		if (attendence.check2==attendence.IS_PRESENT) {
			working_hr=8;
		}
		else if (attendence.check2==attendence.IS_PART_TIME) {
			working_hr=4;
		}
		else {
			working_hr=0;
		}
		salary = working_hr * SALARY_PER_HR;
		System.out.println("One month Employee salary is: "+salary+"Rs");
}
}
class totalwage extends daywage{
	 void wage1() {
		 double totalempwage=0.0;
		for (int day=0; day<NO_OF_DAYS; day++) {
			daywage.wage(); // accessing method from daywage class.
			totalempwage = totalempwage + salary;
			System.out.println("total one month employeee wage: " +totalempwage +"Rs");
		}	
	}
}
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
		System.out.println("Welcome to employee wage computation.");
//		EmpWage.employeeAttendace(); // main method programs ends here.
		
//same program using different class, methods and variables.
		
		attendence.attendanceCheck(); // static method accessed using class name
		attendence obj=new attendence(); 
		obj.partTimeCheck(); // accessed by creating object
		daywage.wage();
		totalwage obj2= new totalwage();
		obj2.wage1();
	}
}