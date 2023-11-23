package skillo.W3resourseOOP.TrafficLight;

public class TrafficLight {

    private String color;
    private int duration;

    public TrafficLight(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    void changeTheColor(String newColor){
        this.color = newColor;
    }

    public String getColor() {
        return color;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public boolean isGreen(){
        return color.equals("green");
    }

    public boolean isRed(){
        return color.equals("red");
    }
}
