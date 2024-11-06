public class DemoBank {
    public static void main(String[] args) {
        Bank sbi = new Bank(241, 5000, 5);
        sbi.deposit(1000);

        // Create a Savings account
        Savings sbiSavings = new Savings(242, 3000, 4, 1000);
        sbiSavings.deposit(500);
        sbiSavings.withdraw(2000); // Valid withdrawal
        sbiSavings.withdraw(3000); // Invalid withdrawal
    }
}
