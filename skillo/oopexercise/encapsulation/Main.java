package skillo.oopexercise.encapsulation;

public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("Ivan Ivanov");

        System.out.println(bankAccount.getAccountBalance());
        System.out.println(bankAccount.getOwnerName());
        System.out.println(bankAccount.getAccountNumber());
        bankAccount.makeTransaction(250);
        System.out.println(bankAccount.getAccountBalance());

    }
}
