package barberShop;

import java.time.LocalDate;

public class Booking {

	private LocalDate bookingDate;
	private ServiceType bookingService;
	private User user;
	private Employee serviceEmployee;

	public LocalDate getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}

	public ServiceType getBookingService() {
		return bookingService;
	}

	public void setBookingService(ServiceType bookingService) {
		this.bookingService = bookingService;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Employee getServiceEmployee() {
		return serviceEmployee;
	}

	public void setServiceEmployee(Employee serviceEmployee) {
		this.serviceEmployee = serviceEmployee;
	}
}


