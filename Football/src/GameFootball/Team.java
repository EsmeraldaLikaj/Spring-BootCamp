package GameFootball;

import java.util.List;

public class Team {
	private String teamName;
	private Person coach;
	private List<Person> players;
	
	@Override
	public String toString() {
		return "Team [teamName=" + teamName + "]";
	}
	
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public Person getCoach() {
		return coach;
	}
	public void setCoach(Person coach) {
		this.coach = coach;
	}
	public List<Person> getPlayers() {
		return players;
	}
	public void setPlayers(List<Person> players) {
		this.players = players;
	}
	
}
