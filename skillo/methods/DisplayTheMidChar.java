package skillo.methods;

import java.util.Scanner;

public class DisplayTheMidChar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a word: ");
        String word = input.nextLine();

        System.out.println(printMiddleChars(word));
    }
    static String printMiddleChars(String word){
        String chars = "";
        if (word.length() % 2 == 0) {
            chars = word.substring(word.length() / 2 - 1, word.length() / 2 + 1);
        }
        else {
            chars += word.charAt(word.length() / 2);
        }
        System.out.print("The middle characters of the string are: ");
        return chars;
    }
}
