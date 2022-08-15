package com.bridgelabz;

class TotalWage {
	void wage1() {
		double totalEmpWage = 0.0;
		int totalWorkingHrs = 0;
		for (int day = 1; day <= EmpWage.maxWorkingDays && totalWorkingHrs <= EmpWage.maxWorkingHrs; day++) {
			DayWage obj=new DayWage();
			obj.wage(); // accessing method from DayWage class.
			totalEmpWage = totalEmpWage + DayWage.salary;
			totalWorkingHrs += DayWage.working_hr;
			System.out.println("sal"+ DayWage.salary);
			System.out.println("total"+ totalEmpWage);
			System.out.println("totalh" + totalWorkingHrs);
		System.out.printf("%10d      %5d      %5d      %5d\n", day, DayWage.working_hr, DayWage.salary, totalWorkingHrs + DayWage.working_hr);
		}	
		System.out.println("Total wage for a month of " + EmpWage.getCompanyName() + " employee is " + totalEmpWage + "\n");
	}
}
