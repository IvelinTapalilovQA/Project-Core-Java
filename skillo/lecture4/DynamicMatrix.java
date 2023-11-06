package skillo.lecture4;

import java.util.Scanner;

public class DynamicMatrix {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the count of rows: ");
        int rows = input.nextInt();
        System.out.println("Enter the count of cols");
        int cols = input.nextInt();

        int[][] dynamicMatrix = new int[rows][cols];

        //Two for loops to create the Matrix!
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.println("Enter a number for the Matrix: ");
                dynamicMatrix[row][col] = input.nextInt();
            }
        }
        //Two for loops for print the Matrix!
        System.out.println("The Matrix is: ");
        for (int row = 0; row < rows; row++) {
            System.out.println();
            for (int col = 0; col < cols; col++) {
                System.out.print(dynamicMatrix[row][col] + " ");
            }
        }
    }
}
