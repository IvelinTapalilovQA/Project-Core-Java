package progress.lecture4;

import java.util.LinkedList;
import java.util.Scanner;

public class FillsTheBlankSpaces {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String firstWord = input.next();
        String secondWord = input.next();
        String thirdWord = input.next();

        String sentence = "My name is ____. I am ___ years old and I am teacher at \"_______\" school.";

        LinkedList<String> listOfWords = new LinkedList<>();
        listOfWords.add(firstWord);
        listOfWords.add(secondWord);
        listOfWords.add(thirdWord);

        for (String word : listOfWords) {
            sentence = sentence.replaceFirst("_+", word);
        }
    System.out.println(sentence);
    }
}
