public class empWage {

	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int EMP_WAGE_PER_HOUR = 20;
	public static final int MAX_WORKING_DAYS = 20;

	static int totalEmpWage;

	public static int calculate_wage() {

		for (int day = 1; day <= MAX_WORKING_DAYS; day++){
			int empHours, empWage;

			int empCheck =(int) Math.floor(Math.random() * 10) % 3;
				switch(empCheck) {
					case IS_FULL_TIME :
						empHours = 8;
						break;
					case IS_PART_TIME :
						empHours = 4;
						break;
					default :
						empHours = 0;
				}
			empWage = empHours * EMP_WAGE_PER_HOUR;
			totalEmpWage += empWage;
			System.out.println("Day " + day + " Wage : " + empWage);
		}
		return totalEmpWage;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation problem using OOPs");

		calculate_wage();
		System.out.println("Total Employee Wage is : " + totalEmpWage);
	}
}
