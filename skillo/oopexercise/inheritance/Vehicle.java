package skillo.oopexercise.inheritance;

public class Vehicle {

   private   String brand;
   private   String model;
   private   double length;
   private   double width;
   private   double weightInKg;
   private   int horsePower;
   private   int maxSpeed;

    Vehicle(String brand, String model, double length, double width, double weightInKg, int horsePower, int maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.length = length;
        this.width = width;
        this.weightInKg = weightInKg;
        this.horsePower = horsePower;
        this.maxSpeed = maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWeightInKg() {
        return weightInKg;
    }

    public void setWeightInKg(double weightInKg) {
        this.weightInKg = weightInKg;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    protected void honk() {
        System.out.println("Beep beep");
    }
}
