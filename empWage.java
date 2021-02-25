class CompanyEmpWage {
	public final String companyName;
	public final int empWagePerHour;
	public final int maxWorkingDays;
	public final int maxWorkingHours;
	public int totalEmpWage;

	public CompanyEmpWage(String companyName, int empWagePerHour, int maxWorkingDays, int maxWorkingHours) {
		this.companyName = companyName;
		this.empWagePerHour = empWagePerHour;
		this.maxWorkingDays = maxWorkingDays;
		this.maxWorkingHours = maxWorkingHours;
	}

	public void setTotalEmpWage(int totalEmpWage){
		this.totalEmpWage = totalEmpWage;
	}

	@Override
	public String toString(){
		return "Total Wage of : " + companyName + " is : " + totalEmpWage;
	}
}

public class empWage {

	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;

	private int numOfCompany = 0;
	private CompanyEmpWage[] companyEmpWageArray;

	public empWage() {
		companyEmpWageArray = new CompanyEmpWage[5];
	}

	private void addCompanyWage(String companyName, int empWagePerHour, int maxWorkingDays, int maxWorkingHours){
		companyEmpWageArray[numOfCompany] = new CompanyEmpWage(companyName, empWagePerHour,maxWorkingDays, maxWorkingHours);
		numOfCompany++;
	}

	private void computeWage(){
		for(int i=0; i<numOfCompany; i++){
			companyEmpWageArray[i].setTotalEmpWage(this.computeWage(companyEmpWageArray[i]));
			System.out.println(companyEmpWageArray[i]);
		}
	}


	public int computeWage(CompanyEmpWage companyEmpWage){
		int totalWorkingDays = 0;
		int totalEmpHours = 0;
		int empHours = 0;
		int empWage = 0;

		while( totalWorkingDays < companyEmpWage.maxWorkingDays && totalEmpHours <= companyEmpWage.maxWorkingHours) {
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

			totalWorkingDays++;

			empWage = empHours * companyEmpWage.empWagePerHour;
			System.out.println("Day " + totalWorkingDays + " Wage : " + empWage);
			totalEmpHours += empHours;
		}
		return totalEmpHours * companyEmpWage.empWagePerHour;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation problem using OOPs");

		empWage eWage = new empWage();

		eWage.addCompanyWage("Dmart", 20, 20, 50);
		eWage.addCompanyWage("Reliance Store", 10, 25, 60);
		eWage.addCompanyWage("Big Bazaar", 25, 18, 45);

		eWage.computeWage();
	}
}
