package skillo.lecture3;

import java.util.Scanner;
public class CalculateTheRevenue {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double unitPrice = input.nextDouble();

        if (unitPrice <= 0){
            System.out.println("You are entering an invalid unit price!");
            System.exit(0);
        }
        int quantity = input.nextInt();

        double currentAmount = unitPrice * quantity;

        int discount15 = 15;
        int discount20 = 20;
        double discountResult, amountAfterDiscount;

        if (quantity >= 100 && quantity <= 120){
            discountResult = (currentAmount * discount15) / 100;
            amountAfterDiscount = currentAmount - discountResult;
            System.out.println("Enter unit price: " + unitPrice);
            System.out.println("Enter quantity: " + quantity);
            System.out.println("The revenue from sale: " + amountAfterDiscount);
            System.out.println("Discount: " + discountResult);
        }
        else if (quantity > 120) {
            discountResult = (currentAmount * discount20) / 100;
            amountAfterDiscount = currentAmount - discountResult;
            System.out.println("Enter unit price: " + unitPrice);
            System.out.println("Enter quantity: " + quantity);
            System.out.println("The revenue from sale: " + amountAfterDiscount);
            System.out.println("Discount: " + discountResult);
        }
        else if (quantity > 0) {
            discountResult = 0;
            amountAfterDiscount = currentAmount;
            System.out.println("Enter unit price: " + unitPrice);
            System.out.println("Enter quantity: " + quantity);
            System.out.println("The revenue from sale: " + amountAfterDiscount);
            System.out.println("Discount: " + discountResult);
        }
        else{
            System.out.println("You are entering an invalid quantity!");
        }
    }
}
