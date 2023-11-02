package progress.lecture2;

import java.util.Scanner;

public class NegativeOrPositiveNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        if (number < 0){
            System.out.println("The number is negative!");
        } else if (number > 0) {
            System.out.println("The number is positive!");
        } else
            System.out.println("The number is zero!");
    }
}
