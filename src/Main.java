
public class Main {
    public static void main(String[] args) {

        bankApplication b1 = new bankApplication(0); // 0-savings, 1-current, 2- demat, 4-FD
        b1.deposit(5000);
        System.out.println(b1.getBalance());
        b1.withdraw(1000);

        System.out.println(b1.getBalance());


        b1.setAcType(0); // 0-savings, 1-current, 2- demat, 4-FD
        System.out.println(b1.getIntRate());

    }
}



