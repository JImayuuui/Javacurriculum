package curriculum.j;

class FullTimeEmployee extends Employee {
    public FullTimeEmployee(int id, String name) {
        super(id, name);
    }
    @Override
    public int costForDay(int hoursWorked) {
        int baseRate = 1250;
        if (hoursWorked <= 8) {
            return hoursWorked * baseRate;
        } else {
        	int NomalPay = 8 * baseRate;
            int overtimePay = (int) ((hoursWorked - 8) * baseRate * 1.25);
            return NomalPay + overtimePay;
            
        }
    }	
        	
        	
        	
        	
        }
