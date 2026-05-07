package curriculum.j;

class ContractEmployee extends Employee {
    public ContractEmployee(int id, String name) {
        super(id, name);
    }

    @Override
    public int costForDay(int hoursWorked) {
        return hoursWorked * 1000;
    }
}
