package progress.collections;

import java.util.Arrays;

public class TwoDimArrayExercise {

    public static void main(String[] args) {

        int[][] matrix = new int[5][5];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                    matrix[row][col] = row * matrix[col].length + col + 1;
            }
        }
        for (int[] ints : matrix) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
