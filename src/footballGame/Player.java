package footballGame;

public class Player{
	
	private String name;
	private String surname;
	private String address;
	private PlayerPosition position;
	private int salary;
	private Team team;

	public Player(String name, String surname, String address, PlayerPosition position, int salary, Team team) {
		super();
		this.name = name;
		this.surname = surname;
		this.address = address;
		this.position = position;
		this.salary = salary;
		this.team = team;
	}

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public PlayerPosition getPosition() {
		return position;
	}

	public void setPosition(PlayerPosition position) {
		this.position = position;
	}
	
	
}
