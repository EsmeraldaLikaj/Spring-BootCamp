package ExerciseTwo;

import java.util.List;

public class Referee extends Person{

    private int numberOfGamesCoordinated;
    private List<Game> gamesCoordinated;
    private double rating;

    public Referee(String firstName, String lastName, int age, int numberOfGamesCoordinated, double rating, List<Game> gamesCoordinated) {
        super(firstName, lastName, age);
        this.numberOfGamesCoordinated = numberOfGamesCoordinated;
        this.rating = rating;
        this.gamesCoordinated = gamesCoordinated;
    }

    public int getNumberOfGamesCoordinated() {
        return numberOfGamesCoordinated;
    }

    public void setNumberOfGamesCoordinated(int numberOfGamesCoordinated) {
        this.numberOfGamesCoordinated = numberOfGamesCoordinated;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public List<Game> getGamesCoordinated() {
        return gamesCoordinated;
    }

    public void setGamesCoordinated(List<Game> gamesCoordinated) {
        this.gamesCoordinated = gamesCoordinated;
    }
}
