package ExcerciseThree;

import java.util.Objects;

public class Service {

    private String service;
    private double price;

    public Service(String service, double price) {
        this.service = service;
        this.price = price;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Service service1 = (Service) o;
        return Objects.equals(service, service1.service);
    }

    @Override
    public int hashCode() {
        return Objects.hash(service);
    }
}
