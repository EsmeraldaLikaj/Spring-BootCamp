package ExerciseTwo;

import java.util.Date;

public class Game {

    private Referee referee;
    private Place place;
    private Team teamOne;
    private Team teamTwo;
    private Date date;

    public Game(Referee referee, Place place, Team teamOne, Team teamTwo, Date date) {
        this.referee = referee;
        this.place = place;
        this.teamOne = teamOne;
        this.teamTwo = teamTwo;
        this.date = date;
    }

    public Referee getReferee() {
        return referee;
    }

    public void setReferee(Referee referee) {
        this.referee = referee;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public Team getTeamOne() {
        return teamOne;
    }

    public void setTeamOne(Team teamOne) {
        this.teamOne = teamOne;
    }

    public Team getTeamTwo() {
        return teamTwo;
    }

    public void setTeamTwo(Team teamTwo) {
        this.teamTwo = teamTwo;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
