package skillo.lecture4;

import java.util.Scanner;

public class SumOfTheArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int arraySize = input.nextInt();

        int[] arrayOfNumbers = new int[arraySize];

        int sumOfNumbers = 0;

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            System.out.println("Enter a number for the array: ");
            arrayOfNumbers[i] = input.nextInt();
        }
        for (int arrayNumber : arrayOfNumbers) {
            sumOfNumbers += arrayNumber;
        }
        System.out.println("The sum of the array is: " + sumOfNumbers);
    }
}