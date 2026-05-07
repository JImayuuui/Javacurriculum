package curriculum.j;
	interface Billable {
	    int costForDay(int hoursWorked);
	    String getName();
	}
	abstract class Employee implements Billable {
	    protected int id;
	    protected String name;

	    public Employee(int id, String name) {
	        this.id = id;
	        this.name = name;
	    }
	        
	        @Override
	        public String getName() {
	            return this.name;
	        }
}
