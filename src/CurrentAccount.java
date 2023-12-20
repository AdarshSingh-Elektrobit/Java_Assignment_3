class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(double overdraftLimit) {
        super();
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > balance + overdraftLimit) {
            System.out.println("Withdrawal not possible. Exceeds overdraft limit.");
        } else {
            balance -= amount;
            System.out.println("Amount withdrawn: " + amount);
            displayBalance();
        }
    }
}