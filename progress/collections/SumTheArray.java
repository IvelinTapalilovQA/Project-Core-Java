package progress.collections;

public class SumTheArray {

    public static void main(String[] args) {

      int[] numbersArray = {12, 46, 82, 14, 51};
      int sumResult = 0;

        for (int number : numbersArray) {
            sumResult += number;
        }
    System.out.println(sumResult);
    }
}
