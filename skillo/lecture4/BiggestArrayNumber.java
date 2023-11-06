package skillo.lecture4;

import java.util.Scanner;

public class BiggestArrayNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int arraySize = input.nextInt();

        int[] arrayOfNumbers = new int[arraySize];

        int biggestNumber = Integer.MIN_VALUE;

        for (int num = 0; num < arrayOfNumbers.length; num++) {
            System.out.println("Enter a number for the array: ");
            arrayOfNumbers[num] = input.nextInt();
        }

        for (int arrayNumber : arrayOfNumbers) {
            if (arrayNumber > biggestNumber) {
                biggestNumber = arrayNumber;
            }
        }

        System.out.println("The biggest number in the array is: " + biggestNumber);
    }
}
