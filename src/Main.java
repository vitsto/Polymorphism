import exceptions.CheckAuthorization;
import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;
import license.LicenseB;
import license.LicenseC;
import license.LicenseD;
import sponsors.Contributor;
import sponsors.LegalEntity;
import sponsors.PrivatePerson;
import transport.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camri", 2.5, BodyType.SEDAN);
        Car car2 = new Car("Mercedes", "Benz", 3.2, BodyType.COUPE);
        Car car3 = new Car("Kia", "Rio", 1.7, BodyType.HATCHBACK);
        Car car4 = new Car("Toyota", "Vitz", 0.7, BodyType.HATCHBACK);
        car2.pitStop();
        System.out.println(car1.getBestTime());
        car1.getType();
        car2.getType();
        car3.getType();
        car4.getType();

        Bus bus1 = new Bus("бренд 1", "модель 1", 3.0, Capacity.EXTRA_SMALL);
        Bus bus2 = new Bus("бренд 2", "модель 2", 5.0, Capacity.MEDIUM);
        Bus bus3 = new Bus("бренд 3", "модель 3", 2.8, Capacity.SMALL);
        Bus bus4 = new Bus("бренд 4", "модель 4", 6.2, Capacity.LARGE);
        bus2.pitStop();
        System.out.println(bus1.getBestTime());
        bus1.getType();
        bus2.getType();
        bus3.getType();
        bus4.getType();

        Truck truck1 = new Truck("бренд 1", "модель 1", 3.5, LoadCapacity.N1);
        Truck truck2 = new Truck("бренд 2", "модель 2", 4.0, LoadCapacity.N2);
        Truck truck3 = new Truck("бренд 3", "модель 3", 2.2, LoadCapacity.N3);
        Truck truck4 = new Truck("бренд 4", "модель 4", 3.0, LoadCapacity.N1);
        truck1.getType();
        truck2.getType();
        truck3.getType();
        truck4.getType();
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

        petrov.setLicense(null);
        try {
            System.out.println("Диагностика машины " + car1 + ": " + car1.runDiagnostics());
            System.out.println("Диагностика автобуса " + bus1 + ": " + bus1.runDiagnostics());
            System.out.println("Диагностика грузовика " + truck1 + ": " + truck1.runDiagnostics());

        } catch (IllegalDiagnosticException e) {
            System.out.println(e.getMessage() + " y " + e.getDriver());
        }

        Contributor contributor1 = new PrivatePerson("Скрудж Макдак", 1250);
        Contributor contributor2 = new PrivatePerson("Дональд Дак", 2150);
        Contributor contributor3 = new LegalEntity("ООО \"Рога и Копыта\"", 4200);
        Contributor contributor4 = new LegalEntity("ОАО \"Oil Trade\"", 5500);

        car1.getContributors().addAll(Arrays.asList(contributor1, contributor3));
        car2.getContributors().add(contributor1);
        car3.getContributors().add(contributor3);

        truck1.getContributors().addAll(Arrays.asList(contributor2, contributor4, contributor3));
        truck2.getContributors().add(contributor1);
        truck2.getContributors().add(contributor2);

        bus1.getContributors().add(contributor3);
        bus2.getContributors().add(contributor4);

        Mechanic<Transport> mechanic1 = new Mechanic<>("Джон Смит", "Автоленд");
        mechanic1.addTransport(car1);
        mechanic1.addTransport(truck1);
        mechanic1.addTransport(bus1);

        Mechanic<Car> mechanic2 = new Mechanic<>("Фрейд Рурк", "Гараж Экстрим");
        mechanic2.addTransport(car1);
        mechanic2.addTransport(car2);
//        mechanic2.addTransport(truck1);

        car1.getMechanics().forEach(System.out::println);
    }
}