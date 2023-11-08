package progress.lecture3;

public class PrimeNumbers {
    public static void main(String[] args) {

        boolean primeNumber = true;
        int num;

        for (num = 2; num <= 100; num++) {
            for (int i = 2; i <= num / 2; ++i) {
                if (num % i == 0) {
                    primeNumber = false;
                    break;
                }
            }
            if (primeNumber){
                System.out.println(num);
            }
            primeNumber = true;
        }
    }
}
