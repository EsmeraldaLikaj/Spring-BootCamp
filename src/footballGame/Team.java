package footballGame;

import java.util.List;

public class Team {
	
	private String teamName;
	private String location;
	private List <Player> players;
	private Coach teamCoach;
	private TeamStrategies strategy;

	public Team(String teamName, String location, List<Player> players, Coach teamCoach, TeamStrategies strategy) {
		super();
		this.teamName = teamName;
		this.location = location;
		this.players = players;
		this.teamCoach = teamCoach;
		this.strategy = strategy;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

	public Coach getTeamCoach() {
		return teamCoach;
	}

	public void setTeamCoach(Coach teamCoach) {
		this.teamCoach = teamCoach;
	}

	public TeamStrategies getStrategy() {
		return strategy;
	}

	public void setStrategy(TeamStrategies strategy) {
		this.strategy = strategy;
	}
	
	

}
