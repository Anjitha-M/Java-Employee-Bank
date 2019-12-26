public class Employee {

    public Employee() {
        this(0, "", 0);
    }

    public Employee(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private double balance;

    public double getBalance() {
        return balance;
    }

    public void addSalary(double salary) {
        balance = balance + salary;
    }
}
