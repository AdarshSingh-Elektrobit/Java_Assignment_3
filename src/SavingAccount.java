class SavingAccount extends Account {
    private double interestRate;

    public SavingAccount(double interestRate) {
        super();
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = balance * (interestRate / 100);
        deposit(interest);
        System.out.println("Interest added: " + interest);
    }
}