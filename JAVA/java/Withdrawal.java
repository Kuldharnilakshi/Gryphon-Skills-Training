
class ATM {
    int balance = 1000;

    synchronized void withdraw(String name, int amount) {
        System.out.println(name + " is trying to withdraw " + amount);

        if (balance >= amount) {
            System.out.println(name + " withdrawal in progress...");
            for (int i = 1; i <= 4; i++) {
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println(name + " is processing.. " + (i * 20) + "%");
            }
            balance -= amount;
            System.out.println(name + " successfully withdrawn " + amount);
            System.out.println("Remaining balance " + balance);
            System.out.println("*");
        } else {
            System.out.println("Not enough balance for " + name);
            System.out.println("Withdrawal stopped");
            System.out.println("*");
        }
    }
}

class Customer extends Thread {
    ATM atm;
    String name;
    int amount;

    public Customer(ATM atm, String name, int amount) {
        this.atm = atm;
        this.name = name;
        this.amount = amount;
    }

    public void run() {
        atm.withdraw(name, amount);
    }
}

public class Withdrawal {
    public static void main(String[] args) {
        ATM a = new ATM();

        for (int i = 1; i < 7; i++) {
            Customer c = new Customer(a, "Customer Thread : " + i, 200);
            c.start();
        }
    }
}