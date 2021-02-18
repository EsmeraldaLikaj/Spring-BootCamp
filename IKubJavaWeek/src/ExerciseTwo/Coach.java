package ExerciseTwo;

public class Coach extends Person{

    private double rating;
    private Team team;

    public Coach(String firstName, String lastName, int age, double rating, Team team) {
        super(firstName, lastName, age);
        this.rating = rating;
        this.team = team;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public void updateStrategy(Strategy strategy) {
        this.team.setStrategy(strategy);
    }

    public void updatePosition(Player player, Position position) {
        this.team.getPlayers().forEach(p -> {
            if(p == player) {
                p.setPosition(position);
            }
        });
    }

}
