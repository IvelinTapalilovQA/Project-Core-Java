package progress.lecture3;

import java.util.Scanner;

public class DoWhileExercise {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String answer;

        do {
            System.out.print("Enter a first number: ");
            int numberOne = input.nextInt();
            System.out.print("Enter a second number: ");
            int numberTwo = input.nextInt();
            int result = numberOne + numberTwo;
            System.out.println("The result of adding the two numbers is: " + result);
            System.out.println("Do you want to perform the operation again?");
            answer = input.next();
        }
        while (answer.equals("Yes"));
    }
}
