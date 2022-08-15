package com.bridgelabz;

class TotalWage extends DayWage {
		 void wage1() {
			 double totalempwage=0.0;
			for (int day=0; day<NO_OF_DAYS; day++) {
				DayWage.wage(); // accessing method from DayWage class.
				totalempwage = totalempwage + salary;
				System.out.println("total one month employeee wage: " +totalempwage +"Rs");
			}	
		}

}
