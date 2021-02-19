package ushtrimi2;

public class Player {
	
	private String name;
	private int age;
	private int position;
	
	public Player(String name, int age,int position) {
		this.name = name;
		this.age = age;
		this.position=position;
	}
	public Player() {
		this.name="";
		this.age=0;
		this.position=0;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	
	
}
