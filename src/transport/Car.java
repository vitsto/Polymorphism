package transport;

import fuel.Diesel;
import fuel.Electricity;
import fuel.Fuel;
import fuel.Petrol;


public class Car extends Transport implements Competing{
       public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    public Fuel[] getAllowedFuels() {
        return new Fuel[]{new Petrol(), new Diesel(), new Electricity()};
    }

    @Override
    public void pitStop() {
        System.out.println("Меняем шины легковушке");
    }

    @Override
    public double getBestTime() {
        return 15.23;
    }

    @Override
    public double getMaxSpeed() {
        return 201;
    }
}
