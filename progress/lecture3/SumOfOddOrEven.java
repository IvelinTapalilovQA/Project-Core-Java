package progress.lecture3;

import java.util.Scanner;

public class SumOfOddOrEven {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int arraySize = input.nextInt();

        int[] arrayOfNumbers = new int[arraySize];

        int oddSum = 0;
        int evenSum = 0;
        int counter = 1;

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            System.out.print("Enter the " + (counter + i) + " number in the array: ");
            arrayOfNumbers[i] = input.nextInt();
        }

        for (int number : arrayOfNumbers) {
            if (number % 2 == 0) {
                evenSum += number;
            } else
                oddSum += number;
        }
        System.out.println("The sum of the odd numbers is: " + oddSum);
        System.out.println("The sum of the even numbers is: " + evenSum);
    }
}
