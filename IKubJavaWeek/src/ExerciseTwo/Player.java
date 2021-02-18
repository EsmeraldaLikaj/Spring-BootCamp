package ExerciseTwo;

public class Player extends Person{

    private int appearances;
    private int goals;
    private double shootingAccuracy;
    private double passingAccuracy;
    private Position position;
    private Team team;


    public Player(String firstName, String lastName, int age, int appearances, int goals, double shootingAccuracy, double passingAccuracy, Position position) {
        super(firstName, lastName, age);
        this.appearances = appearances;
        this.goals = goals;
        this.shootingAccuracy = shootingAccuracy;
        this.passingAccuracy = passingAccuracy;
        this.position = position;
    }

    public Player(String firstName, String lastName, int age, int appearances, int goals, double shootingAccuracy, double passingAccuracy, Position position, Team team) {
        this(firstName, lastName, age, appearances, goals, shootingAccuracy, passingAccuracy, position);
        this.team = team;
    }

    public int getAppearances() {
        return appearances;
    }

    public void setAppearances(int appearances) {
        this.appearances = appearances;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public double getShootingAccuracy() {
        return shootingAccuracy;
    }

    public void setShootingAccuracy(double shootingAccuracy) {
        this.shootingAccuracy = shootingAccuracy;
    }

    public double getPassingAccuracy() {
        return passingAccuracy;
    }

    public void setPassingAccuracy(double passingAccuracy) {
        this.passingAccuracy = passingAccuracy;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

}
