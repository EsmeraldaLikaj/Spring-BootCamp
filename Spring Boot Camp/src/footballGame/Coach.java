package footballGame;

public class Coach {
	private String name;
	private String surname;
	Team team;

	public Coach(String name, String surname, Team team) {
		super();
		this.name = name;
		this.surname = surname;
		this.team = team;
	}

	public Coach() {
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

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public void setStrategy(Strategy strategy) {
		team.setStrategy(strategy);
	}

	public void setRole(Player player, Role role) {		
		for (Player player2 : team.getTeam()) {
			
			if (player2.getNumber()==player.getNumber()) {
				player.setRole(role);
			}
		}
	}

}
