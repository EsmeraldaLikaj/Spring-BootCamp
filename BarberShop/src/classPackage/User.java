package classPackage;
import java.util.List;
import enumPackage.Days;
import enumPackage.Role;
import enumPackage.Services;

public class User {
	private String name;
	private String surname;
	private String email;
	private String password;
	private Role role;
	private List<Booking> booking;
	private List<Days> days;
	private List<Services> services;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public List<Booking> getBooking() {
		return booking;
	}
	public void setBooking(List<Booking> booking) {
		this.booking = booking;
	}
	public List<Days> getDays() {
		return days;
	}
	public void setDays(List<Days> days) {
		this.days = days;
	}
	public List<Services> getServices() {
		return services;
	}
	public void setServices(List<Services> services) {
		this.services = services;
	}
	
	@Override
	public String toString() {
		return "User [name=" + name + ", surname=" + surname + ", email=" + email + ", password=" + password + ", role="
				+ role + ", days=" + days + ", services=" + services + "]";
	}
	
	
}
