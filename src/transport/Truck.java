package transport;

import fuel.Diesel;
import fuel.Fuel;

public class Truck extends Transport implements Competing{

    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public Fuel[] getAllowedFuels() {
        return new Fuel[] {new Diesel()};
    }

    @Override
    public void pitStop() {
        System.out.println("Меням шины грузовику");
    }

    @Override
    public double getBestTime() {
        return 17.00;
    }

    @Override
    public double getMaxSpeed() {
        return 150;
    }
}
