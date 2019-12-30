package Employee;

import javax.security.sasl.SaslServer;
import java.util.Objects;

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

    @Override
    public String toString() {
        return "Employee.Employee [" +
                "id = " + id +
                ", name = " + name +
                ", balance = " + balance +
                ']';
    }

    @Override
    public boolean equals(Object o) {
        //Employee e1 = new Employee(10);             collectionex.
        //Employee e2 = e1;
        // boolean result = e1.equals(e2);
        if (this == o) return true;        //check if both this and o references the same object
        //Employee e1 = new Employee(10);
        //Employee e2 = null;
        // boolean result = e1.equals(e2);


        //Employee e1 = new Employee(10);
        //String e2 = "10";
        // boolean result = e1.equals(e2);
        if (o == null || !(o instanceof Employee)) {
            return false;
        } // check whether o is null, or of another datatype

        //Employee e1 = new Employee(10);
        //Employee e2 = new Employee(9);
        // boolean result = e1.equals(e2);

        Employee employee = (Employee) o; // now wkt, o is not referring to same object as this, not null, and of correct type.

        return (this.id == employee.id);
        // so typecast it to correct type,then check equality based on some field.
    }

    @Override
    public int hashCode() {
        return id;
    }
}
