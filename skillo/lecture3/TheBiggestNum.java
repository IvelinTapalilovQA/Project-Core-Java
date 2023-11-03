package skillo.lecture3;

import java.util.Scanner;

public class TheBiggestNum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] arrayNums = new int[5];
        int counter = 1;

        for (int i = 0; i < arrayNums.length; i++) {
            System.out.println("Enter the " + (counter + i) + " number in the array: ");
            arrayNums[i] = input.nextInt();
        }

        int biggestNum = Integer.MIN_VALUE;

        for (int num = 0; num < arrayNums.length; num++) {
            if (arrayNums[num] > biggestNum){
                biggestNum = arrayNums[num];
            }
        }
        System.out.println("The biggest number in the array is: " + biggestNum);
    }
}
