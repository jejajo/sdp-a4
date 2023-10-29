package factories;

import car.Car;
import car.Bugatti;

public class BugattiFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Bugatti();
    }
}