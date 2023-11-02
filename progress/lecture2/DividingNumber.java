package progress.lecture2;

import java.util.Scanner;

public class DividingNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println("The number is divisible by two!");
        }else if (number % 3 == 0) {
            System.out.println("The number is divisible by three!");
        }
        else System.out.println("The number is neither divisible by two nor by three!");
        }
    }