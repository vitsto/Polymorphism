import license.LicenseB;
import license.LicenseC;
import license.LicenseD;
import transport.Bus;
import transport.Car;
import transport.Driver;
import transport.Truck;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camri", 2.5);
        Car car2 = new Car("Mercedes", "Benz", 3.2);
        Car car3 = new Car("Kia", "Rio", 1.7);
        Car car4 = new Car("Toyota", "Vitz", 0.7);
        car2.pitStop();
        System.out.println(car1.getBestTime());

        Bus bus1 = new Bus("бренд 1", "модель 1", 3.0);
        Bus bus2 = new Bus("бренд 2", "модель 2", 5.0);
        Bus bus3 = new Bus("бренд 3", "модель 3", 2.8);
        Bus bus4 = new Bus("бренд 4", "модель 4", 3.2);
        bus2.pitStop();
        System.out.println(bus1.getBestTime());

        Truck truck1 = new Truck("бренд 1", "модель 1", 3.5);
        Truck truck2 = new Truck("бренд 2", "модель 2", 4.0);
        Truck truck3 = new Truck("бренд 3", "модель 3", 2.2);
        Truck truck4 = new Truck("бренд 4", "модель 4", 3.0);
        truck2.pitStop();
        System.out.println(truck1.getBestTime());

        System.out.println("\n\nГОНКА");
        Driver<LicenseB> ivanov = new Driver<>("Иванов Иван Иванович", new LicenseB(car1), 10);
        ivanov.start();
        ivanov.refill();
        ivanov.stop();
        System.out.println(ivanov + "\n");


        Driver<LicenseC> petrov = new Driver<>("Петров Петр Петрович", new LicenseC(truck1), 5);
        petrov.start();
        petrov.refill();
        petrov.stop();
        System.out.println(petrov + "\n");

        Driver<LicenseD> sidorov = new Driver<>("Сидоров Сидор Сидорович", new LicenseD(bus1), 4);
        sidorov.start();
        sidorov.refill();
        sidorov.stop();
        System.out.println(sidorov + "\n");

    }
}