package ExerciseTwo;

import java.util.List;

public class Team {

    private String name;
    private List<Player> players;
    private Coach coach;
    private Strategy strategy;

    public Team(String name, List<Player> players, Coach coach, Strategy strategy) {
        this.name = name;
        this.players = players;
        this.coach = coach;
        this.strategy = strategy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Coach getCoach() {
        return coach;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
