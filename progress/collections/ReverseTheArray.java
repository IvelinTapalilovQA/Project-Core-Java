package progress.collections;

import java.util.Arrays;

public class ReverseTheArray {
    public static void main(String[] args) {

      int[] numbersArray = {23, 45, 47, 56, 9};
      int[] reversedArray = new int[numbersArray.length];

        for (int i = 0; i < numbersArray.length; i++) {
            reversedArray[i] = numbersArray[numbersArray.length - 1 - i];
        }
      System.out.println(Arrays.toString(reversedArray));
    }
}
