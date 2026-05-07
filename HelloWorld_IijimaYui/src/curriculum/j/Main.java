package curriculum.j;

import java.util.ArrayList;
import java.util.List;

public class Main {
public static void main(String[] args) {
	
	List<Billable> List = new ArrayList<>();
	
	List.add(new FullTimeEmployee(201, "中田"));
	List.add(new ContractEmployee(301, "佐藤"));
	List.add(new ContractEmployee(302, "畑中"));
	List.add(new FullTimeEmployee(202, "鈴木"));
	
	int hours = 10;
	
	System.out.println("労働時間: "+ hours +"時間の日給計算");
	
	for (Billable b : List) {
		int cost = b.costForDay(hours);
		System.out.println("名前: " + b.getName() +"  請求額: " + cost + "円");
	
	}
}
}
