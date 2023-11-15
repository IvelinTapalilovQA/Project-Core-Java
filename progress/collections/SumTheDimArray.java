package progress.collections;

public class SumTheDimArray {
    public static void main(String[] args) {

        int[][] numbersMatrix = {
                {12,46,51},
                {15,56,98},
                {5,39,41}
        };
        int sumResult = 0;

        for (int row = 0; row < numbersMatrix.length; row++) {
            for (int col = 0; col < numbersMatrix[row].length; col++) {
                sumResult += numbersMatrix[row][col];
            }
        }
        System.out.println("The sum of the matrix is: " + sumResult);
    }
}
