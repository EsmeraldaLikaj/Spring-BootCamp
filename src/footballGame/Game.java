package footballGame;

import java.time.LocalDate;

public class Game {
	
	private Referee referee;
	private Team firstTeam;
	private Team secondTeam;
	private String location;
	private LocalDate gameDate;
	
	public Game(Referee referee, Team firstTeam, Team secondTeam, String location, LocalDate gameDate) {
		super();
		this.referee = referee;
		this.firstTeam = firstTeam;
		this.secondTeam = secondTeam;
		this.location = location;
		this.gameDate = gameDate;
	}

	public Referee getReferee() {
		return referee;
	}

	public void setReferee(Referee referee) {
		this.referee = referee;
	}

	public Team getFirstTeam() {
		return firstTeam;
	}

	public void setFirstTeam(Team firstTeam) {
		this.firstTeam = firstTeam;
	}

	public Team getSecondTeam() {
		return secondTeam;
	}

	public void setSecondTeam(Team secondTeam) {
		this.secondTeam = secondTeam;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public LocalDate getDate() {
		return gameDate;
	}

	public void setDate(LocalDate gameDate) {
		this.gameDate = gameDate;
	}

}
