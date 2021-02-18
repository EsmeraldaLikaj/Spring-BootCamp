package GameFootball;

import java.util.List;

import enumPackage.Positions;
import enumPackage.Role;
import enumPackage.Strategies;

public class Person {
	private String name;
	private String surname;
	private int age;
	private Role role;
	private Team team;
	private List<Positions> positions;
	private List<Strategies> strategies;
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", surname=" + surname + ", age=" + age + ", role=" + role + ", positions="
				+ positions + ", strategies=" + strategies + "]";
	}
	
	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public List<Positions> getPositions() {
		return positions;
	}
	public void setPositions(List<Positions> positions) {
		this.positions = positions;
	}
	public List<Strategies> getStrategies() {
		return strategies;
	}
	public void setStrategies(List<Strategies> strategies) {
		this.strategies = strategies;
	}
}
