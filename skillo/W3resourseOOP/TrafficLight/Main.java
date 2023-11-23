package skillo.W3resourseOOP.TrafficLight;

public class Main {

    public static void main(String[] args) {

        TrafficLight trafficLightOne = new TrafficLight("Red", 30);
        TrafficLight trafficLightTwo = new TrafficLight("Green", 45);

        System.out.println("The traffic light is red " + trafficLightOne.isRed());
        System.out.println("The traffic light is green " + trafficLightTwo.isGreen());

        //Changing the traffic lights
        trafficLightOne.changeTheColor("green");
        trafficLightTwo.changeTheColor("red");

        System.out.println("The traffic light is green now " + trafficLightOne.isGreen());
        System.out.println("The traffic light is red now " + trafficLightTwo.isRed());

        System.out.println(trafficLightOne.getDuration());
        System.out.println("\nSet new duration for trafficLightOne");
        trafficLightOne.setDuration(60);
        System.out.println("The duration now is: " + trafficLightOne.getDuration());
    }
}
