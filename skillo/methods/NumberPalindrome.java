package skillo.methods;

import java.util.Scanner;

public class NumberPalindrome {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = input.nextInt();

        System.out.print("Is the number palindrome - ");
        System.out.println(checkPalindrome(number));
    }

    static boolean checkPalindrome(int number) {
        int newNumber = 0;
        int copyNumber = number;
        int lastnumber;

        while (number > 1) {
            lastnumber = number % 10;
            number /= 10;
            newNumber = newNumber * 10;
            newNumber += lastnumber;
        }
        return newNumber == copyNumber;
    }
}
