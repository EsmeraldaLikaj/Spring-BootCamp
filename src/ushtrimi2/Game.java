package ushtrimi2;

public class Game {
	private Referee referee;
	private Place place;
	private Team team1;
	private Team team2;
	
	public Game(Referee referee, Place place, Team team1, Team team2) {
		this.referee = referee;
		this.place = place;
		this.team1 = team1;
		this.team2 = team2;
	}
	public Game() {
		this.referee=new Referee();
		this.place=new Place();
		this.team1=new Team();
		this.team2=new Team();
	}
	public Referee getReferee() {
		return referee;
	}
	public void setReferee(Referee referee) {
		this.referee = referee;
	}
	public Place getPlace() {
		return place;
	}
	public void setPlace(Place place) {
		this.place = place;
	}
	public Team getTeam1() {
		return team1;
	}
	public void setTeam1(Team team1) {
		this.team1 = team1;
	}
	public Team getTeam2() {
		return team2;
	}
	public void setTeam2(Team team2) {
		this.team2 = team2;
	}
	
}
