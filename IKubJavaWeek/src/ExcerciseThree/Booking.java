package ExcerciseThree;

import java.util.Date;
import java.util.Objects;

public class Booking {

    private Client client;
    private Employee employee;
    private Service service;
    private Date date;

    public Booking(Client client, Employee employee, Service service, Date date) {
        this.client = client;
        this.employee = employee;
        this.service = service;
        this.date = date;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Booking booking = (Booking) o;
        return Objects.equals(client, booking.client) && Objects.equals(employee, booking.employee) && Objects.equals(service, booking.service) && Objects.equals(date, booking.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(client, employee, service, date);
    }
}
