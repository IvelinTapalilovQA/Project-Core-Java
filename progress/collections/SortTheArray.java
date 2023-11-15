package progress.collections;

import java.util.Arrays;

public class SortTheArray {
    public static void main(String[] args) {

        int[] numbersArray = {25, 18, 19, 20, 48, 5};

        System.out.println(Arrays.toString(numbersArray));

        Arrays.sort(numbersArray);

        System.out.println(Arrays.toString(numbersArray));
    }
}
