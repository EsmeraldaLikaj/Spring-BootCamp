package football;

import java.util.List;

public class Team {
	private String name;
	private List<Player> players;
	private Coach coach;
	private Strategies strategy;
	
	public String getTeamName(){
		return name;
	}
	public void setTeamName(String name) {
		this.name=name;
	}
	
	public List<Player> getPlayers(){
		return players;
	}
	public void setPlayers(List<Player> players) {
		this.players=players;
	}
	
	public Coach getCoach(){
		return coach;
	}
	public void setCoach(Coach coach) {
		this.coach=coach;
	}
	
	public Strategies getStrategy(){
		return strategy;
	}
	public void setStrategy(Strategies strategy) {
		this.strategy=strategy;
	}
	
	

}

