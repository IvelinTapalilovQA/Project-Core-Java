package skillo.oopexercise.encapsulation;

import java.util.Date;
import java.util.Random;

public class BankAccount {

    private String ownerName;
    private double accountBalance = 0;
    private String accountNumber;

    BankAccount(String ownerName) {
        this.ownerName = ownerName;
        ownerName = ownerName.replace(" ", "");
        setAccountNumber(ownerName);
    }

    BankAccount(String ownerName, double transaction) {
        this.accountBalance = this.accountBalance + transaction;
        setOwnerName(ownerName);
        setAccountNumber(ownerName);
    }


    public String getOwnerName(){
        return this.ownerName;
    }

    public void setOwnerName(String ownerName){
        if (this.ownerName == null){
            this.ownerName = ownerName;
        }
    }

    public double getAccountBalance(){
        return this.accountBalance;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    private void setAccountNumber(String ownerName){
        Date d = new Date();
        Random r = new Random();
        this.accountNumber = ownerName + d.getTime() + r.nextInt();
    }

    public void makeTransaction(int transaction){
        this.accountBalance = this.accountBalance + transaction;
    }


}
