public class Savings extends Bank {
    double minimum_balance;

    Savings(int a, double b, double i, double m) {
        super(a, b, i);
        minimum_balance = m;
    }

    void withdraw(double money) {
        if (bal - money < minimum_balance) {
            System.out.println("Withdrawal denied! Minimum balance of " + minimum_balance + "/- must be maintained.");
        } else {
            bal -= money;
            System.out.println(money + "/- has been withdrawn. Current balance: " + bal + "/-");
        }
    }
}
