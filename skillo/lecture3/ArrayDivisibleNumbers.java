package skillo.lecture3;

public class ArrayDivisibleNumbers {
    public static void main(String[] args) {

        int[] arrayNumbers = {12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200};

        for (int number : arrayNumbers) {
            if (number % 5 == 0) {
                System.out.println(number);
                if (number > 150) {
                    break;
                }
            }
        }
    }
}
