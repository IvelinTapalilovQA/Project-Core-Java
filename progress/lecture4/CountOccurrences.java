package progress.lecture4;

public class CountOccurrences {
    public static void main(String[] args) {

        String inputString = "Maggie is an engineer.Gilbert is an artist.";

        String substring = "gi";

        int counterOne = 0;
        int counterTwo = 0;
        int index = 0;
        int indexLowerCase = 0;


        while (index != -1) {
            index = inputString.indexOf(substring, index + substring.length());
            if (index != -1) {
                counterOne += 1;
            }
        }
        while (indexLowerCase != -1) {
            String inputStringIgnoreCase = inputString.toLowerCase();
            indexLowerCase = inputStringIgnoreCase.indexOf(substring, indexLowerCase + substring.length());
            if (indexLowerCase != -1) {
                counterTwo += 1;
            }
        }
        System.out.println("The count of occurrences: " + counterOne);
        System.out.println("The count of occurrences with ignore case: " + counterTwo);
    }
}