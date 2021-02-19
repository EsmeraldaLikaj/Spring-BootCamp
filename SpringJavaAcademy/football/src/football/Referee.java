package football;

import java.util.List;

public class Referee extends Person {
	private List <Game> games;
	
	public List<Game> getGame(){
		return games;
	}
	public void setGame(List<Game> games) {
		this.games=games;
	}

}
