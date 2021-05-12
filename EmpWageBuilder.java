public class EmpWageBuilder {
	public static void main(String[] args) {
		//constants
		int IS_PART_TIME = 1;
		int IS_FULL_TIME = 2;
		int EMP_RATE_PER_HR = 20;
		//variables
		int empHrs=0;
		int empWage=0;
		//computation
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == IS_PART_TIME)
		    empHrs=4;
		else if (empCheck == IS_PART_TIME)
			empHrs=4;
		else
			empHrs=0;
		empWage = empHrs * EMP_RATE_PER_HR;
		System.out.println("Emp Wage: " + empWage);
	}
}
