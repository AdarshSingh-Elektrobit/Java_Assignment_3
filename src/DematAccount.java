class DematAccount extends Account {
    public String tradingLicense;

    public DematAccount(String tradingLicense) {
        super();
        this.tradingLicense = tradingLicense;
    }

    public void tradeStocks() {
        // Implement functionality for trading stocks
        System.out.println("Trading stocks using license: " + tradingLicense);
    }
}
