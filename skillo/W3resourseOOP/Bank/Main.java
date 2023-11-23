package skillo.W3resourseOOP.Bank;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank();

        Account accountOne = new Account("Stratimir Ivanov", 122412, 3000);
        Account accountTwo = new Account("Petyr Petrov", 872312, 12000);

        bank.addAccount(accountOne);
        bank.addAccount(accountTwo);


        ArrayList<Account> accounts = bank.getAccounts();

        for (Account account : accounts)
            System.out.println(account.getAccountInfo()); {
        }

        bank.depositMoney(accountOne, 5000);
        System.out.println(accountOne.getAccountInfo());

        bank.withdrawMoney(accountTwo, 3000);
        System.out.println(accountTwo.getAccountInfo());

    }
}
