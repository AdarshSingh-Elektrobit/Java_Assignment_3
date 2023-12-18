public class bankApplication {
    /*
    In this assignment You must have to create method first and then call it in main.

    Program programming must take input from user.

    Make as generic as possible.

    · Create a bank application

    · Where user get deposit their amount.

    · Withdraw their amount.

    · Three type of account they can choose. (Saving, current, demat)

    · Make a separate section for F.D where user can deposit money for fix time period.

    · Use oops concept for creating this application.

    · You must show the current balance for user. When he performed deposit and withdraw.
    */

    public int getBalance() {
        return balance;
    }


    public float getIntRate() {
        return IntRate;
    }




    public void setAcType(int acType) {
        this.acType = acType;
    }
    public void deposit(int depositAmt){
        balance +=depositAmt;
        System.out.println("Amount Deposit Successful");
    }

    public void withdraw(int withdrawAmt)
    {
        if (withdrawAmt<=balance){
        balance-=withdrawAmt;
        System.out.println("Amount Withdraw successful");
        }
        else
        {
            System.out.println("You dont have sufficient balance");
        }
    }

    public void startFD(int principle_Amt,int no_ofYears)
    {
        int principleAmt = principle_Amt;
        final float rateOfInterest = 0.08f;
        int noOfYears = no_ofYears ;

    }
    private int balance = 0;
    private float IntRate = 4.5f;

    public bankApplication(int acType ) {
        this.acType = acType;
    }

    private int acType =0; // 0-savings, 1-current, 2- demat, 4-FD

    public int getFdAmt() {
        return fdAmt;
    }

    public void setFdAmt(int fdAmt) {
        this.fdAmt = fdAmt;
    }

    private int fdAmt  =  0;


}
