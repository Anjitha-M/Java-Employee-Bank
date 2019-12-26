public class EmployeeMain {
    public static void main(String[] args) {
        Employee[] emp = new Employee[4];
        emp[0] = new Employee(1, "Rohan", 500);
        emp[1] = new Employee(2, "Rahul", 1000);
        emp[2] = new Employee(3, "Arjun", 1000);
        emp[3] = new Employee(4, "Aditi", 5000);
        Manager m1 = new Manager(1, "ITManager", 10000);
        Manager m2 = new Manager(2, "HRManager", 10000);

        emp[0].addSalary(500);
        emp[1].addSalary(500);
        emp[2].addSalary(900);
        emp[3].addSalary(900);

        m1.addManagedEmployee(emp[0]);
        m1.addManagedEmployee(emp[1]);
        m2.addManagedEmployee(emp[2]);
        m2.addManagedEmployee(emp[3]);
        Employee[] managedEmpIT = new Employee[2];
        Employee[] managedEmpHR = new Employee[2];
        managedEmpIT = m1.getManagedEmployees();
        managedEmpHR = m2.getManagedEmployees();

        EmployeeMain empm = new EmployeeMain();
        //empm.print(emp);
        System.out.println("IT Manager is:");
        empm.printManager(m1);
        System.out.println("manages:");
        empm.print(managedEmpIT);
        System.out.println("HR Manager is:");
        empm.printManager(m2);
        System.out.println("manages:");
        empm.print(managedEmpHR);


    }

    public void print(Employee[] emp) {
            for (int i = 0; i < 2; i++) {
                System.out.print("Emp id: " + emp[i].getId());
                System.out.print(", Emp name: " + emp[i].getName());
                System.out.print(", Emp balance: " + emp[i].getBalance());
                System.out.println();

            }
    }

    public void printManager(Employee emp) {
            System.out.print("Emp id: " + emp.getId());
            System.out.print(", Emp name: " + emp.getName());
            System.out.print(", Emp balance: " + emp.getBalance());
            System.out.println();


    }
}
