package footballGame;

import java.util.ArrayList;
import java.util.List;

public class Team {
	private List<Player> team;
	private Coach coach;
	private Strategy strategy;

	public Team(List<Player> team, Coach coach, Strategy strategy) {
		super();
		this.team = team;
		this.coach = coach;
		this.strategy = strategy;
	}

	public Team() {
		super();
	}

	public List<Player> getTeam() {
		return team;
	}

	public void setTeam(List<Player> team) {
		this.team = team;
	}

	public Coach getCoach() {
		return coach;
	}

	public void setCoach(Coach coach) {
		this.coach = coach;
	}

	public Strategy getStrategy() {
		return strategy;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	public void addPlayers(Player player) {
		if(team==null)
			{
			team=new ArrayList<Player>();
			}
		team.add(player);
	}

}
