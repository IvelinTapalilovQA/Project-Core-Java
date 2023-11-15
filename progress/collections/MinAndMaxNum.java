package progress.collections;

import java.util.ArrayList;
import java.util.Arrays;

public class MinAndMaxNum {
    public static void main(String[] args) {

        int[] numbersArray = {12, 45, 77, 69, 32, 5};
        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;

        for (int currentNumber : numbersArray) {
            if (currentNumber > maxNum)
                maxNum = currentNumber;
            if (currentNumber < minNum) {
                minNum = currentNumber;
            }
        }
        System.out.println("The max number in the array is: " + maxNum);
        System.out.println("The min number in the array is: " + minNum);

        ArrayList<Integer> numbersList = new ArrayList<>(Arrays.asList(12, 45, 77, 69, 32, 5));

        int maxNumList = Integer.MIN_VALUE;
        int minNumList = Integer.MAX_VALUE;

        for (int i = 0; i < numbersList.toArray().length; i++) {
            int currentNum = numbersList.get(i);
            if (currentNum > maxNumList) {
                maxNumList = currentNum;
            }
            if (currentNum < minNumList) {
                minNumList = currentNum;
            }
        }
        System.out.println("The max number in the arrayList is: " + maxNumList);
        System.out.println("The min number in the arrayList is: " + minNumList);
    }
}
