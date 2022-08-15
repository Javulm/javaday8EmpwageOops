package com.bridgelabz;
interface IEmployeeWageComputation
{
    public void addCompany(String companyName, int wagePerHr, int maxWorkingDays, int maxWorkingHrs);

    public void calculateTotalWage();
}
public class EmpWage {
	public static final int PART_TIME = 1;			// instance constants
	public static final int FULL_TIME = 2;
	int totalWage;
	int noOfCompanies, index;
	CompanyWage[] companies;


    public EmpWage(int noOfCompanies) {

        this.noOfCompanies = noOfCompanies;
        companies = new CompanyWage[noOfCompanies];
        index = 0;
    }
    public void addCompany(String companyName, int wagePerHr, int maxWorkingDays, int maxWorkingHrs) {
        companies[index++] = new CompanyWage(companyName, wagePerHr, maxWorkingDays, maxWorkingHrs);
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
		for (int day = 1, totalWorkingHrs = 0; day <= companyWage.MAX_WORKING_DAYS
				&& totalWorkingHrs <= companyWage.MAX_WORKING_HRS; day++, totalWorkingHrs += workingHrs) 
		{
			int empType = generateEmployeeType();
			workingHrs = getWorkingHrs(empType);
			int wage = workingHrs * companyWage.WAGE_PER_HR;
			totalWage += wage;
			System.out.printf("%5d       %5d      %5d      %5d\n", day, workingHrs, wage, totalWorkingHrs + workingHrs);
		}
	     return totalWage;
	}

	public static void main(String args[]) {
		EmpWage employeeWageComputation = new EmpWage(3);
        employeeWageComputation.addCompany("Wipro", 6, 250, 100);
        employeeWageComputation.addCompany("Google", 4, 30, 150);
        employeeWageComputation.addCompany("TCS", 8, 20, 200);
        employeeWageComputation.calculateTotalWage();
	}
}
