package skillo.lecture3;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of people: ");
        int people = input.nextInt();

        System.out.println("Enter the number of days: ");
        int days = input.nextInt();

        System.out.println("Enter your budget: ");
        double budget = input.nextDouble();
        double budgetPerDay = budget / (days * people);

        System.out.println("Enter a destination: ");
        String destination = input.next();

        switch (destination){
            case "Beach":
                if (budgetPerDay >= 50){
                    System.out.println("We suggest your summer vacation be abroad!");
                }
                else {
                    System.out.println("We suggest your summer vacation be in Bulgaria!");
                }
                break;
            case "Mountain":
                if (budgetPerDay >= 30) {
                    System.out.println("We suggest your vacation in the mountains be abroad!");
                }
                else {
                    System.out.println("We suggest your vacation in the mountains be in Bulgaria!");
                }
                break;
            default:
                System.out.println("You entering in invalid destination!");
        }
    }
}
