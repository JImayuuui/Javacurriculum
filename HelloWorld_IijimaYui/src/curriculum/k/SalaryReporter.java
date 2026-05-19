package curriculum.k;

public class SalaryReporter {

	public void report(Payable payable, int salary) {
		System.out.println(payable.getName() + " の給料は " + salary + " 円");
	}
}