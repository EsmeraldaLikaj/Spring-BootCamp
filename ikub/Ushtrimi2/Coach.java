package Ushtrimi2;

public class Coach {
	private String firstname;
	private String lastname;
	Team team;

	public Coach(String firstname, String lastname, Team team) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.team = team;
	}

	public Coach() {
		super();
	}

	public String getfirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

}
