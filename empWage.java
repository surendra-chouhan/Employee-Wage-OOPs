public class empWage {

	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int EMP_WAGE_PER_HOUR = 20;

	public static void calculate_wage() {
		int empHours, empWage;

		int empCheck =(int) Math.floor(Math.random() * 10) % 3;
		switch (empCheck) {
			case IS_FULL_TIME :
				System.out.println("Employee is Full Time");
				empHours = 8;
				break;
			case IS_PART_TIME :
				System.out.println("Employee is Part Time");
				empHours = 4;
				break;
			default :
				System.out.println("Employee is Absent");
				empHours = 0;
		}
		empWage = empHours * EMP_WAGE_PER_HOUR;
		System.out.println("Daily Wage of an Employee is : " + empWage);
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation problem using OOPs");

		calculate_wage();
	}
}
