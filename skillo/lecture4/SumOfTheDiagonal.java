package skillo.lecture4;

public class SumOfTheDiagonal {
    public static void main(String[] args) {

         int[][] matrix = {
                 {12, 7, 3, 8},
                 {5, 6, 32, 11},
                 {7, 8, 17, 10},
                 {11, 7, 33, 18}
         };

         int sum = 0;
         int sumOppositeDiagonal = 0;

         //Sum of the diagonal from left to right
         for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                if (row == col){
                   sum += matrix[row][col];
                }
            }
         }
         System.out.println("Sum of the diagonal from left to right is: " + sum);

         //Sum of the diagonal from right to left
         for (int row = 0; row < 4; row++){
            sumOppositeDiagonal += matrix[row][3 - row];
         }
         System.out.println("Sum of the diagonal from right to left is: " + sumOppositeDiagonal);
    }
}
