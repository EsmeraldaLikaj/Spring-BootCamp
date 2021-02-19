package footballGame;

public class Referee {
	private String name;
	private String surname;
	private String birthplace;

	public Referee(String name, String surname, String birthplace) {
		super();
		this.name = name;
		this.surname = surname;
		this.birthplace = birthplace;
	}
	
	public Referee() {
		super();
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

	public String getBirthplace() {
		return birthplace;
	}

	public void setBirthplace(String birthplace) {
		this.birthplace = birthplace;
	}

}
