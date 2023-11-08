package progress.lecture3;

public class ContinueExample {

    public static void main(String[] args) {

        for (int apartment = 1 ; apartment <= 10; apartment++) {
            if (apartment == 7){
                continue;
            }
            System.out.println("Apartment number: " + apartment);
        }
    }
}
