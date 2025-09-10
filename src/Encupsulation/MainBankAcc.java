package Encupsulation;

public class MainBankAcc {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Chan To", 100);
        System.out.println(bankAccount.getBalance());
        System.out.println(bankAccount.withdraw(10));
        System.out.println(bankAccount.getBalance());

        System.out.println(bankAccount.withdraw(90));
        System.out.println(bankAccount.getBalance());

    }
}
