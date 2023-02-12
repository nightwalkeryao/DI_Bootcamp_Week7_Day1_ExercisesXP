public class Car extends Vehicle {
    private String name;

    public void setDetails(String name) {
        this.name = name;
    }

    public String getDetails(String carName) {
        return carName + ", " + getModel() + ", " + getSpeed();
    }
}
