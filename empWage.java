public class empWage {

	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;

	private final String companyName;
	private final int empWagePerHour;
	private final int maxWorkingDays;
	private final int maxWorkingHours;
	private int totalEmpWage;
	private final int empHoursFullTime;
	private final int empHoursPartTime;

	public empWage(String companyName, int empWagePerHour, int maxWorkingDays, int maxWorkingHours, int empHoursFullTime, int empHoursPartTime) {
		this.companyName = companyName;
		this.empWagePerHour = empWagePerHour;
		this.maxWorkingDays = maxWorkingDays;
		this.maxWorkingHours = maxWorkingHours;
		this.empHoursFullTime = empHoursFullTime;
		this.empHoursPartTime = empHoursPartTime;
	}

	public String toString(){
		return "Total Wage of : " + companyName + " is : " + totalEmpWage;
	}

	public void calculate_wage() {
		int totalWorkingDays = 0;
		int totalEmpHours = 0;
		int empHours = 0;
		int empWage = 0;

		while( totalWorkingDays < maxWorkingDays && totalEmpHours <= maxWorkingHours) {
		int empCheck =(int) Math.floor(Math.random() * 10) % 3;

                switch(empCheck) {
                        case IS_FULL_TIME :
				empHours = empHoursFullTime;
                                break;
                        case IS_PART_TIME :
                                empHours = empHoursPartTime;
                                break;
                        default :
                                empHours = 0;
                        }

			totalWorkingDays++;

			empWage = empHours * empWagePerHour;
			System.out.println("Day " + totalWorkingDays + " Wage : " + empWage);
			totalEmpWage += empWage;
			totalEmpHours += empHours;
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation problem using OOPs");

		empWage Dmart = new empWage("Dmart", 20, 20, 50, 8, 4 );
		empWage Reliance = new empWage("Reliance Store", 10, 25, 60, 10, 5 );
		empWage BigBazaar = new empWage("Big Bazaar", 25, 18, 45, 12, 6 );

		System.out.println("Dmart Employee : ");
		Dmart.calculate_wage();
		System.out.println(Dmart);

		System.out.println("Reliance Employee : ");
		Reliance.calculate_wage();
		System.out.println(Reliance);

		System.out.println("Big Bazaar Employee : ");
		BigBazaar.calculate_wage();
		System.out.println(BigBazaar);

	}
}
