public class empWage {

	public static final int IS_PRESENT = 1;
	public static final int EMP_WAGE_PER_HOUR = 20;

	public static void calculate_wage() {
		int empHours, empWage;

		int empCheck =(int) Math.floor(Math.random() * 10) % 2;
		switch (empCheck) {
			case IS_PRESENT :
				System.out.println("Employee is Present");
				empHours = 8;
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
