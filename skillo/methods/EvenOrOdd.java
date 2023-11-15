package skillo.methods;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int number = input.nextInt();

        System.out.print("Is the number even - ");
        System.out.println(checkEvenOrOdd(number));
    }
    static boolean checkEvenOrOdd(int number){
        return number % 2 == 0;
    }
}
