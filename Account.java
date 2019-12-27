package bank.entity;

public class Account {
    private int id;
    private String name;
    private double balance;

    public Account() {
    }

    public Account(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void addBalance(double amount){
        balance = balance + amount;
        System.out.println("balance updated for the account of " +this.getName());
    }

    @Override
    public String toString() {
        return "Account Details [" +
                "id = " + id +
                ", name = " + name +
                ", balance = " + balance +
                ']';
    }

    public  void transferAmount(Account a, double amount){
        if(amount < balance){
            a.balance = a.balance + amount;
            balance = balance - amount;
            System.out.println("Amount " + amount +" transferred from account " + this.getId() + " to account " + a.getId() );
        }
        else {

            System.out.println("Insufficient balance");
        }


    }
}
