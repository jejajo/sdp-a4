package orders;

import car.Car;
import factories.BugattiFactory;

public class BugattiOrder extends Order {
    @Override
    public Car createCar() {
        return new BugattiFactory().createCar();
    }
}