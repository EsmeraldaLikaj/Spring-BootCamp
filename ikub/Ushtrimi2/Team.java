package Ushtrimi2;

import java.util.List;

public class Team {
	private String name;
	private Coach coach;
	private List<Player> team;
	private String place;
	public Team(String name, Coach coach, List<Player> team, String place) {
		super();
		this.name = name;
		this.coach = coach;
		this.team = team;
	}

	public Team() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Coach getCoach() {
		return coach;
	}

	public void setCoach(Coach coach) {
		this.coach = coach;
	}

	public List<Player> getTeam() {
		return team;
	}

	public void setTeam(List<Player> team) {
		this.team = team;
	}

	public void addPlayers(Player player) {
		team.add(player);
	}
	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}
}
