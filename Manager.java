public class Manager extends Employee {
    int i = 0;
    private Employee managedEmployees[] = new Employee[2];

    public Manager(int id, String name, double balance) {
        super(id, name, balance);
    }

    public Employee[] getManagedEmployees() {
        return managedEmployees;
    }

    public void addManagedEmployee(Employee e){
        managedEmployees[i] = e;
        i++;
    }
}
