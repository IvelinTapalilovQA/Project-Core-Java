package skillo.lecture3;

import java.util.Scanner;
public class CalculateTheRevenue {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter unit price: ");
        double unitPrice = input.nextDouble();

        if (unitPrice <= 0){
            System.out.println("You are entering an invalid unit price!");
            System.exit(0);
        }

        System.out.println("Enter quantity: ");
        int quantity = input.nextInt();

        if (quantity <= 0){
            System.out.println("You are entering an invalid unit price!");
            System.exit(0);
        }

        double currentAmount = unitPrice * quantity;

        int discount15 = 15;
        int discount20 = 20;
        double discountAmount, revenue;
        String revenueMessage = "The revenue from sale: ";
        String discountMessage = "Discount: ";

        if (quantity >= 100 && quantity <= 120){
            discountAmount = (currentAmount * discount15) / 100;
            revenue = currentAmount - discountAmount;
        }
        else if (quantity > 120) {
            discountAmount = (currentAmount * discount20) / 100;
            revenue = currentAmount - discountAmount;
        }
        else{
            discountAmount = 0;
            revenue = currentAmount;
        }

        System.out.println(revenueMessage + revenue);
        System.out.println(discountMessage + discountAmount);
    }
}
