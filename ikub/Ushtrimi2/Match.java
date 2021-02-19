package Ushtrimi2;

public class Match {
	private String matchName;
	private Referee referee;
	private Team firstTeam;
	private Team secondTeam;
	

	public String getmatchName() {
		return matchName;
	}

	public void setName(String matchName) {
		this.matchName = matchName;
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

	public Referee getReferee() {
		return referee;
	}

	public void setReferee(Referee referee) {
		this.referee = referee;
	}


}
