public class Vehicle {
    private String model;
    private double speed;

    public Vehicle() {
        super();
    }

    public Vehicle(String model, double speed) {
        this.model = model;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
