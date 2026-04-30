package curriculum.i;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();

		list.add(new FullTimeEmployee("F01", "尾田"));
		list.add(new FullTimeEmployee("F02", "安食"));
		list.add(new ContractEmployee("C01", "中田"));
		list.add(new ContractEmployee("C02", "黒川"));
		
		for (Employee e : list) {
			System.out.println(e.name + "さんの給与: " + e.DailyMoney(10) + "円");
		
		}
	}

}
