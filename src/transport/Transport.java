package transport;

import fuel.Fuel;
import utilits.Util;

public abstract class Transport {
    private final String brand;
    private final String model;
    private Fuel fuel;
    private double engineVolume;

    public Transport(String brand, String model, double engineVolume) {
        this.brand = Util.isDefine(brand) ? brand : "undefined";
        this.model = Util.isDefine(model) ? model : "undefined";
        this.engineVolume = engineVolume == 0 ? 1.5 : engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void start() {
        System.out.println(getBrand() + " " + getModel() + " начал движение");
    }

    public void stop() {
        System.out.println(getBrand() + " " + getModel() + " закончил движение");
    }

    public abstract void refill(Fuel fuel);

    public abstract Fuel[] getAllowedFuels();

    @Override
    public String toString() {
        return "Марка: " + getBrand() + ", модель: " + getModel() + ", обеъм двигателя: " + getEngineVolume();
    }
}