package curriculum.f;

public class Employee {
	private String name;
	private String employeeId;
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
        return this.name;
	}	
	
	public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
    public String getEmployeeId() {
        return this.employeeId;
    }
	
	public void showInfo() {
		System.out.println("社員ID: " + this.employeeId + ", 名前: " + this.name);
}
	
}
