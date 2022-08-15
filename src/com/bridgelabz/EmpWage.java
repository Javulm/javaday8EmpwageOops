package com.bridgelabz;
import java.util.ArrayList;
import java.util.HashMap;

interface IEmployeeWageComputation {
	public void addCompany(String companyName, int wagePerHr, int maxWorkingDays, int maxWorkingHrs);
	public void calculateTotalWage();
	public int getTotalEmpWage(String companyName);
}
public class EmpWage {
	public static final int PART_TIME = 1; // instance constants
	public static final int FULL_TIME = 2;
	ArrayList<CompanyWage> companies;
	HashMap<String, Integer> totalEmpWages;

	public EmpWage() {
		companies = new ArrayList<>();
		totalEmpWages = new HashMap<>();
	}

	public void addCompany(String companyName, int wagePerHr, int maxWorkingDays, int maxWorkingHrs) {
		CompanyWage company = new CompanyWage(companyName, wagePerHr, maxWorkingDays, maxWorkingHrs);
		companies.add(company);
		totalEmpWages.put(companyName, 0);
	}
	int generateEmployeeType() {
		return (int) (Math.random() * 100) % 3;
	}
	int getWorkingHrs(int empType) {
		switch (empType) {
			case FULL_TIME :
				return 8;
			case PART_TIME :
				return 4;
			default :
				return 0;
		}
	}
	public void calculateTotalWage() {
		for (CompanyWage company : companies) {
			int totalWage = calculateTotalWage(company);
			company.setTotalEmployeeWage(totalWage);
			System.out.println(company);
		}
	}

	int calculateTotalWage(CompanyWage companyWage) {
		System.out.println("Computation of total wage of " + companyWage.COMPANY_NAME + " employee");
		System.out.println("-----------------------------------------------------");
		System.out.printf("%5s     %5s     %5s     %5s\n", "Day", "Workinghrs", "Wage", "Total working hrs");

		int workingHrs, totalWage = 0;
		for (int day = 1, totalWorkingHrs = 0; day <= companyWage.MAX_WORKING_DAYS && totalWorkingHrs <= companyWage.MAX_WORKING_HRS; day++, totalWorkingHrs += workingHrs) {
			int empType = generateEmployeeType();
			workingHrs = getWorkingHrs(empType);
			int wage = workingHrs * companyWage.WAGE_PER_HR;
			totalWage += wage;
			System.out.printf("%5d       %5d      %5d      %5d\n", day, workingHrs, wage, totalWorkingHrs + workingHrs);
		}
		totalEmpWages.put(companyWage.COMPANY_NAME, totalWage);
		return totalWage;
	}
	 public int getTotalEmpWage(String companyName) {
	        return totalEmpWages.get(companyName);
	    }

	public static void main(String args[]) {
		EmpWage employeeWageComputation = new EmpWage();
		employeeWageComputation.addCompany("Wipro", 6, 25, 100);
		employeeWageComputation.addCompany("Google", 4, 30, 150);
		employeeWageComputation.addCompany("TCS", 8, 20, 200);
		employeeWageComputation.addCompany("Amazon", 6, 28, 250);
		employeeWageComputation.calculateTotalWage();
		String query = "Google";
        int totalWage = employeeWageComputation.getTotalEmpWage(query);
        System.out.println("Total Employee Wage for " + query + " company is " + totalWage);

	}
}
