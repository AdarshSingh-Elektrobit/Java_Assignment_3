class Account {
    protected double balance;

    public Account() {
        balance = 0.0;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited: " + amount);
        displayBalance();
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance. Withdrawal not possible.");
        } else {
            balance -= amount;
            System.out.println("Amount withdrawn: " + amount);
            displayBalance();
        }
    }

    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}