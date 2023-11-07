package skillo.lecture4;

import java.util.Scanner;

public class PalindromeString {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String word = input.next();

        StringBuilder newWord = new StringBuilder();
        boolean isPalindrome = false;

        for (int i = 0; i < word.length(); i++) {
          newWord.append(word.charAt((word.length() - 1) - i));
        }
        System.out.println("The reversed word is: " + newWord);

        if(newWord.toString().equals(word)){
            isPalindrome = true;
        }
        System.out.println("Is the word palindrome? - " + isPalindrome);
    }
}
