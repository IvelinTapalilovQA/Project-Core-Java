package progress.lecture3;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int currentNumber = input.nextInt();
            int number = currentNumber;
            int length = String.valueOf(number).length();
            int lastNumber;
            int sum = 0;

            while (currentNumber > 0){
                lastNumber = currentNumber % 10;
                sum += (Math.pow(lastNumber, length));
                currentNumber = currentNumber / 10;
            }
            if (number == sum){
                System.out.println("This is Armstrong number!");
            }
            else
                System.out.println("This is not Armstrong number!");
    }
}