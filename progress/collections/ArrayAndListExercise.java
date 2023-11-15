package progress.collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayAndListExercise {
  public static void main(String[] args) {

    int[] numbersArray = new int[5];

    numbersArray[3] = 7;
    System.out.println(Arrays.toString(numbersArray));
    numbersArray[1] = 12;
    System.out.println(Arrays.toString(numbersArray));
    numbersArray[0] = 77;
    System.out.println(Arrays.toString(numbersArray));
    numbersArray[4] = 32;
    System.out.println(Arrays.toString(numbersArray));
    numbersArray[2] = 14;
    System.out.println(Arrays.toString(numbersArray));

    ArrayList<Integer> numbersList = new ArrayList<>();

    numbersList.add(0, 12);
    System.out.println(numbersList);
    numbersList.add(1, 7);
    System.out.println(numbersList);
    numbersList.add(2, 17);
    System.out.println(numbersList);
    numbersList.add(3, 81);
    System.out.println(numbersList);
    numbersList.add(4, 44);
    System.out.println(numbersList);
    numbersList.add(4, 65);
    System.out.println(numbersList);
    numbersList.add(2, 38);
    System.out.println(numbersList);
  }
}

