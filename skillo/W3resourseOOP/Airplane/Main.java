package skillo.W3resourseOOP.Airplane;

import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {

        Airplane flightOne = new Airplane("CDE212", "Barcelona", LocalTime.of(10, 30));
        Airplane flightTwo = new Airplane("DEG353", "Berlin", LocalTime.of(12,0));
        Airplane flightThree = new Airplane("GWR874", "Milano", LocalTime.of(14, 0));

        System.out.println("Departure time before delay: ");
        System.out.println(flightOne.getScheduledDeparture());
        flightOne.delay(15);
        flightOne.checkStatus();
        System.out.println("Departure time after delay: ");
        System.out.println(flightOne.getScheduledDeparture());


        flightTwo.delay(20);
        flightTwo.checkStatus();

        flightThree.checkStatus();
    }
}
