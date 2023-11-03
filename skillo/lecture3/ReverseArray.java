package skillo.lecture3;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] arrayNumbers = new int[5];
        int[] reversedArray = new int[arrayNumbers.length];
        int counter = 1;

        for (int i = 0; i < arrayNumbers.length; i++) {
            System.out.println("Enter the " + (counter + i) + " number in the array of 5 numbers: ");
            arrayNumbers[i] = input.nextInt();
        }

        int currentNumber = arrayNumbers.length - 1;

        for (int i = 0; i < arrayNumbers.length; i++) {
            reversedArray[i] = arrayNumbers[currentNumber];
            currentNumber -= 1;
        }

        System.out.println("The reversed array is: ");
        for (int i : reversedArray) {
            System.out.print(i + " ");
        }
    }
}