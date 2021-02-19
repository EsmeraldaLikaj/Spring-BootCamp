package footballGame;

public class Coach{
	
	private String name;
	private String surname;
	private String address;
	private int salary;
	private Team team;

	public Coach(String name, String surname, String address, int salary, Team team) {
		super();
		this.name = name;
		this.surname = surname;
		this.address = address;
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
	
	public void setThePlayerPosition(Player player, PlayerPosition position)
	{
		player.setPosition(position);
	}
	
	public void setTheTeamStrategy (Team team, TeamStrategies strategy)
	{
		team.setStrategy(strategy);
	}

}
