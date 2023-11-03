package skillo.lecture3;

import java.util.Scanner;

public class EligibleToWork {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        if (age > 0 && age < 16){
            System.out.println("You are not eligible to work!You are a child!");
        }
        else if (age >= 16 && age <= 63) {
            System.out.println("You are eligible to work!");
        }
        else if (age > 63 && age < 105) {
            System.out.println("You are not eligible to work!You are retired!");
        }
        else{
            System.out.println("You entering an invalid age!");
        }
    }
}
