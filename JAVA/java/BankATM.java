interface Balance {
    void showBalance();
}

interface deposite{
    void depositeMoney();
}

class ATM {

    void withdraw() {
        System.out.println("Withdraw method called");
    }

    void internalWorking() {
        System.out.println("ATM internal working");
    }

    @Override
    public String toString() {
        return "ATM object";
    }
}

public class BankATM extends ATM implements Balance ,deposite {

    @Override
    void internalWorking() {
        System.out.println("Internal working method called");
    }

    @Override
    public void showBalance() {
        System.out.println("Balance is shown");
    }

    public void depositeMoney() {
        System.out.println("Money deposited");
    }

    public static void main(String[] args) {
        BankATM obj = new BankATM();
        obj.withdraw();
        obj.internalWorking();
        obj.showBalance();
        System.out.println(obj);
    }
}
