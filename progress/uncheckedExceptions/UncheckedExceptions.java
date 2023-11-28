package progress.uncheckedExceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedExceptions {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOne ,numberTwo;
        try {
            System.out.println("Provide number to divide: ");
            numberOne = scanner.nextInt();
            System.out.println("Provide number to divide by: ");
            numberTwo = scanner.nextInt();
        } catch (InputMismatchException e){
            System.out.println(e.getMessage());
            return;
        }
        finally {
            scanner.close();
        }

        int result;
        try {
            result = numberOne / numberTwo;
        }catch (ArithmeticException e){
            System.out.println("Division was not possible, because " + e.getMessage());
            return;
        }
        System.out.println(result);
    }
}
