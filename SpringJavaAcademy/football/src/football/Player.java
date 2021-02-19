package football;

public class Player extends Person {
	private Team team;
	private Position position;
	
	public Team getTeam(){
		return team;
	}
	public void setTeam(Team team) {
		this.team=team;
	}
	
	public Position getPosition(){
		return position;
	}
	public void setPosition(Position position) {
		this.position=position;
	}

}
