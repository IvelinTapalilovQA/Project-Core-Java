package skillo.methods;

public class CountStrings {
    public static void main(String[] args) {


        String text = "My name is Mike Tyson. I am 26 years old and I am teacher at Cambridge school.";

        System.out.println(counterOfWords(text));

    }
    static int counterOfWords(String sentence){

        String[] stringArray = sentence.split(" ");
        System.out.print("The number of words in the string is: ");
        return (stringArray.length);
    }
}
