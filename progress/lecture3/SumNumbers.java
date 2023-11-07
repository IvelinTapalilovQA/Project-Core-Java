package progress.lecture3;

public class SumNumbers {
    public static void main(String[] args) {

        int sum = 0;

        for (int num = 1; num <= 100; num++) {
            sum += num;
        }
        System.out.println("If we add the numbers from 1 to 100, the result is: " + sum);
    }
}
