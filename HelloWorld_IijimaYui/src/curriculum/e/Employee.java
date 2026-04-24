package curriculum.e;

public class Employee {
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
		public String getName() {
	        return this.name;
		}	
		
		public void work() {
			System.out.println(this.name + "は働いています。");
	}

}
