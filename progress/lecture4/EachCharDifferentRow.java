package progress.lecture4;

import java.util.Scanner;

public class EachCharDifferentRow {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Type a word and each letter of the word will be printed on a new line.
        System.out.print("Enter a word: ");
        String someWord = input.next();

        for (int i = 0; i < someWord.length() ; i++) {
            System.out.println(someWord.charAt(i));
        }
    }
}
