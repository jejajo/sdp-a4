package orders;

import car.Car;

public abstract class Order {
    public abstract Car createCar();
    public String createOrder() {
        Car car = createCar();
        return car.getModel() + "\n" + car.getSpeed() + "\n" + car.getCapacity() ;
    }
}