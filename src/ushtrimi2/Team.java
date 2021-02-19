package ushtrimi2;

import java.util.ArrayList;

public class Team {
	private ArrayList<Player> players;
	private Coach coach;
	private String strategy;
	
	public Team(ArrayList<Player> players, Coach coach,String strategy) {
		this.players = players;
		this.coach = coach;
		this.strategy=strategy;
	}
	public Team() {
		this.players=null;
		this.coach=new Coach();
		this.strategy="";
	}
	public ArrayList<Player> getPlayers() {
		return players;
	}
	public void setPlayers(ArrayList<Player> players) {
		this.players = players;
	}
	public Coach getCoach() {
		return coach;
	}
	public void setCoach(Coach coach) {
		this.coach = coach;
	}
	public String getStrategy() {
		return strategy;
	}
	public void setStrategy(String strategy) {
		this.strategy = strategy;
	}
	
}
