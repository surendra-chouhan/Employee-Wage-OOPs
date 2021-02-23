public class empWage {

	public static final int IS_PRESENT = 1;

	public static void checkAttendance() {
		int empCheck =(int) Math.floor(Math.random() * 10) % 2;
		switch (empCheck) {
			case IS_PRESENT :
				System.out.println("Employee is Present");
				break;
			default :
				System.out.println("Employee is Absent");
		}

	}

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation problem using OOPs");

		checkAttendance();
	}
}
