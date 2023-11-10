package progress.lecture4;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your string to be reversed: ");
        String sentence = input.nextLine();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < sentence.length(); i++) {
            stringBuilder.append(sentence.charAt((sentence.length() - 1) - i));
        }
        System.out.println("Your reversed string is: " + stringBuilder);
    }
}
