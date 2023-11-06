package skillo.lecture4;

public class PrintMatrix {

    public static void main(String[] args) {

        int[][] matrix = {
                {4, 2, 3},
                {2, 9, 5},
                {11, 3, 4},
                {1, 5, 7}
        };

        for (int row = 0; row < 4 ; row++) {
            System.out.println();
            for (int col = 0; col < 3; col++) {
                    System.out.print(matrix[row][col] + " ");
            }
        }
    }
}
