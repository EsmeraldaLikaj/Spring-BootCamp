package footballGame;


import java.util.ArrayList;

public class Game {
	private Referee referee;
	private String place;
	private ArrayList<Team> teams;
	
	public Game(Referee referee, String place, ArrayList<Team> teams) {
		super();
		this.referee = referee;
		this.place = place;
		this.teams = teams;
	}
	

	public Game() {
		super();
	}


	public Referee getReferee() {
		return referee;
	}

	public void setReferee(Referee referee) {
		this.referee = referee;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public ArrayList<Team> getTeams() {
		return teams;
	}

	public void setTeams(ArrayList<Team> teams) {
		this.teams = teams;
	}
	
	
}
