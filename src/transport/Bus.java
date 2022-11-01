package transport;

import fuel.Diesel;
import fuel.Fuel;
import fuel.Petrol;

public class Bus extends Transport implements Competing {

    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    public Fuel[] getAllowedFuels() {
        return new Fuel[]{new Petrol(), new Diesel()};
    }

    @Override
    public void pitStop() {
        System.out.println("Меняем шины автобусу");
    }

    @Override
    public double getBestTime() {
        return 12.11;
    }

    @Override
    public double getMaxSpeed() {
        return 123;
    }
}
