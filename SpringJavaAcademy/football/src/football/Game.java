package football;

import java.time.LocalDate;

public class Game {
	private Referee referee;
	private String place;
	private LocalDate date;
	private Team team1;
	private Team team2;
	
	public Referee getReferee(){
		return referee;
	}
	public void setReferee(Referee referee) {
		this.referee=referee;
	}
	public String getPlace(){
		return place;
	}
	public void setPlace(String place) {
		this.place=place;
	}
	
	public LocalDate getDate(){
		return date;
	}
	public void setDate(LocalDate date) {
		this.date=date;
	}
	
	public Team getTeam1(){
		return team1;
	}
	public void setTeam1(Team team1) {
		this.team1=team1;
	}
	
	public Team getTeam2(){
		return team2;
	}
	public void setTeam2(Team team2) {
		this.team2=team2;
	}

}

