package footballGame;

public class Player {
	private String name;
	private String surname;
	private int number;
	Role role;
	Team team;

	public Player(String name, String surname, int number, Role role, Team team) {
		super();
		this.name = name;
		this.surname = surname;
		this.number = number;
		this.role = role;
		this.team = team;
	}

	public Player() {
		super();
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

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

}
