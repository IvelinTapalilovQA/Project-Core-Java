package progress.collections;

import java.util.Arrays;

public class CopyTheArray {
    public static void main(String[] args) {

        int[] numbersArray = {12, 45, 77, 5, 11};

        int[] numbersArrayTwo = new int[numbersArray.length];

        System.arraycopy(numbersArray, 0, numbersArrayTwo, 0, numbersArray.length);

    System.out.println(Arrays.toString(numbersArrayTwo));
    }
}
