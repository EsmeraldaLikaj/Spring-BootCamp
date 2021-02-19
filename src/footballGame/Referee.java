package footballGame;

import java.util.List;

public class Referee {
	
	private String name;
	private String surname;
	private int salary;
	private List <Game> games;
	
	public Referee(String name, String surname, int salary, List<Game> games) {
		super();
		this.name = name;
		this.surname = surname;
		this.salary = salary;
		this.games = games;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public List<Game> getGames() {
		return games;
	}

	public void setGames(List<Game> games) {
		this.games = games;
	}

}
