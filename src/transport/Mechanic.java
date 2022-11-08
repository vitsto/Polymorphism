package transport;

import java.util.ArrayList;
import java.util.List;

public class Mechanic<T extends Transport> {
    private final String fullName;
    private String company;

    public Mechanic(String fullName, String company) {
        this.fullName = fullName;
        this.company = company;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void addTransport(T transport) {
        transport.addMechanic(this);
    }

    @Override
    public String toString() {
        return "Имя: " + fullName + ", компания: " + company;
    }
}
