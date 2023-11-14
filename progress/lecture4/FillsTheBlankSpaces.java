package progress.lecture4;

import java.util.Scanner;

public class FillsTheBlankSpaces {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String sentence = "My name is ____. I am ___ years old and I am teacher at \"_______\" school.";

        for (int i = 0; i < 3; i++) {
            System.out.println("Please, enter a word: ");
            sentence = sentence.replaceFirst("_+", input.nextLine());
        }
    System.out.println(sentence);
    }
}
