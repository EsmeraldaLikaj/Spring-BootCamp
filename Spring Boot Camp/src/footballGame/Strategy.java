package footballGame;

public enum Strategy {
	Tactic1("4-4-2-1"), Tactic2("3-4-3-1"), Tactic3("2-5-3-1"), Tactic4("3-3-4-1"), Tactic5("1-5-4-1");

	private String description;

	private Strategy(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
