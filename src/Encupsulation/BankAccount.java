package Encupsulation;

public class BankAccount {
    private String name;
    private Integer balance;

    public BankAccount(){
        name = "Unknown";
        balance = 0;
    }
    public BankAccount(String name , Integer balance){
        this.name = name;
        this.balance = balance;
    }
    public Integer withdraw(Integer amount){
        if (balance > 0){
            if( balance >= amount){
                this.balance = this.balance -  amount;
                return amount;
            }
            return 0;
        }
        return 0;
    }

    public Integer getBalance(){
        return this.balance;
    }

    public void setBalance(Integer amount){
        this.balance = amount;
    }

}
