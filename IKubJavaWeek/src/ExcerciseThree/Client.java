package ExcerciseThree;

import java.util.List;

public class Client {

    private Role role;
    private List<Booking> bookings;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public void addBooking(Booking booking) {
        bookings.add(booking);
    }

    public boolean removeBooking(Booking booking) {
        return bookings.remove(booking);
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }
}
