package football;


public class Coach extends Person {
	private Team team;
	
	public Team getTeam(){
		return team;
	}
	public void setTeam(Team team) {
		this.team=team;
	}
	
	public void setPlayerPosition(Player player, Position position)
	{
		player.setPosition(position);
	}
	
	public void setTeamStrategies(Team team, Strategies strategy)
	{
		team.setStrategy(strategy);
	}

}
