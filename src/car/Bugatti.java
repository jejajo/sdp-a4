package car;

public class Bugatti implements Car {
    @Override
    public String getModel() {
        return "Your car is Bugatti.";
    }
    @Override
    public String getSpeed() {
        return "Your car's maximum speed is 350km/h.";
    }
    @Override
    public String getCapacity() {
        return "Your car's capacity is 8,0 litres.";
    }
}