package Ushtrimi2;

public class Player {
	private String firstname;
	private String lastname;
	private int playerNr;
	Position position;
	Team team;

	public Player(String firstname, String lastname, int playerNr, Position position, Team team) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.playerNr = playerNr;
		this.position = position;
		this.team = team;
	}

	public Player() {
		super();
	}

	public String getFirstname() {
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

	public int getPlayerNr() {
		return playerNr;
	}

	public void setPlayerNr(int playerNr) {
		this.playerNr = playerNr;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

}
