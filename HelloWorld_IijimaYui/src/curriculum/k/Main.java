package curriculum.k;

public class Main {

	public static void main(String[] args) {
		
		Payable f1 = new FullTimeEmployee("山田", 160);
		Payable c1 = new ContractEmployee("佐藤", 120);
	
		SalaryCalculator calculator = new SalaryCalculator();
        SalaryReporter reporter = new SalaryReporter();

        int salary1 = calculator.count(f1);
        int salary2 = calculator.count(c1);
	
        reporter.report(f1, salary1);
        reporter.report(c1, salary2);
	
	}

}
