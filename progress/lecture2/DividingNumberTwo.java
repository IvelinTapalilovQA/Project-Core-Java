package progress.lecture2;

import java.util.Scanner;

public class DividingNumberTwo {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println("The number is divisible by two!");
            if (number % 6 == 0) {
                System.out.println("The number is also divisible by six!");
            }
        }else {
            System.out.println("The number is neither divisible by two nor by six!");
        }
    }
}
