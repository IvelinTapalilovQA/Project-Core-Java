package progress.lecture3;

import java.util.Scanner;

public class ReversedNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int currentNumber = input.nextInt();
        int reversedNumber = 0;
        int lastNumber;

        while (currentNumber > 0){
            lastNumber = currentNumber % 10;
            reversedNumber *= 10;
            reversedNumber += lastNumber;
            currentNumber = currentNumber / 10;
        }
        System.out.println(reversedNumber);
    }
}
