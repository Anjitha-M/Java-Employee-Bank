public class EmployeeMain {
    public static void main(String[] args) {
        Employee[] emp = new Employee[4];
        emp[0] = new Employee(1, "Rohan", 500);
        emp[1] = new Employee(2, "Rahul", 1000);
        //emp[2] = new Employee(3, "Arjun", 1000);
        //emp[3] = new Employee(4, "Aditi", 5000);
        Manager m1 = new Manager(3, "ITManager", 10000);
        Manager m2 = new Manager(4, "HRManager", 10000);
        emp[2] = m1;
        emp[3] = m2;

        emp[0].addSalary(500);
        emp[1].addSalary(500);
        emp[2].addSalary(900);
        emp[3].addSalary(900);

        m1.addManagedEmployee(emp[0]);
        m2.addManagedEmployee(emp[1]);
        //m2.addManagedEmployee(emp[2]);
        //m2.addManagedEmployee(emp[3]);
//        Employee[] managedEmpIT = new Employee[1];
//        Employee[] managedEmpHR = new Employee[1];
//        managedEmpIT = m1.getManagedEmployees();
//        managedEmpHR = m2.getManagedEmployees();

        EmployeeMain empm = new EmployeeMain();
        empm.print(emp);
//        System.out.println("IT Manager is:");
//        empm.printManager(m1);
//        System.out.println("manages:");
//        empm.print(managedEmpIT);
//        System.out.println("HR Manager is:");
//        empm.printManager(m2);
//        System.out.println("manages:");
//        empm.print(managedEmpHR);


    }

    public void print(Employee[] emp) {
            for (Employee e : emp) {
//                System.out.print("Emp id: " + e.getId());
//                System.out.print(", Emp name: " + e.getName());
//                System.out.print(", Emp balance: " + e.getBalance());
                System.out.println(e);

                boolean isManager = e instanceof Manager;
                if(isManager){
                    Manager m = (Manager) e;
                    Employee[] managedEmployees = m.getManagedEmployees();
                    System.out.println(m.getName() + " Managed Employees: ");
                    for(Employee managed : managedEmployees){
                        if(managed != null){
                            //System.out.print("Emp id: " + managed.getId());
                            System.out.print(managed.getName());
                            //System.out.print(", Emp balance: " + managed.getBalance());
                            System.out.println();
                            System.out.println();
                        }
                    }
                }

            }
    }

//    public void printManager(Employee emp) {
//            System.out.print("Emp id: " + emp.getId());
//            System.out.print(", Emp name: " + emp.getName());
//            System.out.print(", Emp balance: " + emp.getBalance());
//            System.out.println();
//
//
//    }
}
