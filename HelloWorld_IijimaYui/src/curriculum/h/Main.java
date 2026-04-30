package curriculum.h;

public class Main {

	public static void main(String[] args) {
		FullTimeEmployee ft = new FullTimeEmployee("F001", "正社員");
        PartTimeEmployee pt = new PartTimeEmployee("P001", "パート社員");

        int hours = 9;
        
        System.out.println(ft.getName() + " の給与: " + ft.calculateDailyWage(hours) + "円");
        System.out.println(pt.getName() + " の給与: " + pt.calculateDailyWage(hours) + "円");
        
	}

}
